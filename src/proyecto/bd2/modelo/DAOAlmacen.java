/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bd2.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;
import java.util.*;

/**
 *
 * @author T-
 */
public class DAOAlmacen {
    
    //debil(metodo), moderado(atributo), fuerte(herencia)
  
    //prueba atributo   public static Almacen almacen =new Almacen();
    
//primera operacion
      
    public  void guardar(Almacen almacen) throws Exception{
        Connection con=Conexion.conectarse();
        
        CallableStatement callate=con.prepareCall("{call guardar_almacen(?,?)}");
       //este es para registrar uno  callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setInt(1, almacen.getNumeroAlmacen());
        callate.setString(2,almacen.getUbicacionAlmacen());

        callate.execute();
        // int pk=callate.getInt(1);
        System.out.println("Se guardo el almacen");
        //cerrar conexion, para evitar saturar la memoria 
        con.close();
        // return pk;
    }
   
    //actualizar --- update con procedimiento almacenado
    public  void actualizar(Almacen almacen) throws Exception{
        Connection con=Conexion.conectarse();
        
        CallableStatement callate=con.prepareCall("{call actualizar_almacen(?,?)}");
       //este es para registrar uno  callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setInt(1, almacen.getNumeroAlmacen());
        callate.setString(2,almacen.getUbicacionAlmacen());

        callate.execute();
        // int pk=callate.getInt(1);
        System.out.println("Se actualizo el almacen");
        //cerrar conexion, para evitar saturar la memoria 
        con.close();
        // return pk;
    }
    
    
public  void buscarPorId (Almacen almacen) throws Exception{
    Connection con=Conexion.conectarse();
    
    CallableStatement cs=con.prepareCall("{}");
}   
    
// sigue el select * from almacen
public static ArrayList<Almacen> buscarTodos() throws Exception{
    //paso 1 generamos el arraylist que contendra la tabla
    ArrayList<Almacen> tablitaAlmacen=new ArrayList<>();
    //paso 2 creamos la conexion
    Connection con=Conexion.conectarse();
    // creamos un statement el cual es un objeto que nos permite
    //hacer un statement de sql
    Statement st= con.createStatement();
    ResultSet res=st.executeQuery("select * from almacen");
    //result set es una clase traductora entre un select y en nuestro caso un arraylist
    
//empezamos el mapeo entre las columnas y los objetos del arrayList
    while(res.next()){
       Integer numeroAlmacen= res.getInt(1);
       String ubicacionAlmacen=res.getString(2);
       //despues estos valores los asignamos a un objeto que es el equivalente
       //a una fila
       Almacen almacen=new Almacen();
       almacen.setNumeroAlmacen(numeroAlmacen);
       almacen.setUbicacionAlmacen(ubicacionAlmacen);
       //en cada iteracion del resultSet agregaremos un objeto a nuestro arrayList
       //y ya logramos nuestro objetivo
       tablitaAlmacen.add(almacen);
    }    
    con.close();
    return tablitaAlmacen;
}

}
