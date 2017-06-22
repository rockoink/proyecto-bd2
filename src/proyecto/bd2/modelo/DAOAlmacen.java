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
    public DAOAlmacen(){
        
    }
    
    //debil(metodo), moderado(atributo), fuerte(herencia)
  
    //prueba atributo   public static Almacen almacen =new Almacen();
    
//primera operacion
      
    public static  void guardar(Almacen almacen) throws Exception{
        Connection con=Conexion.conectarse();
        
        try{
        
        CallableStatement callate=con.prepareCall("{call guardar_almacen(?,?)}");
       //este es para registrar uno  callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setInt(1, almacen.getNumeroAlmacen());
        callate.setString(2,almacen.getUbicacionAlmacen());

        callate.execute();
        // int pk=callate.getInt(1);
        System.out.println("Se guardo el almacen");
        //cerrar conexion, para evitar saturar la memoria 
        callate.close();
        }catch(Exception e){
            
        }
        finally{
        con.close();
        // return pk;
    }
    }
    //actualizar --- update con procedimiento almacenado
    
    
    public static void actualizar(Almacen almacen) throws Exception{
        Connection con=null;
        CallableStatement callate=null;
        try{
            con = Conexion.conectarse();
        
        callate=con.prepareCall("{call actualizar_almacen(?,?)}");
       //este es para registrar uno  callate.registerOutParameter(1,java.sql.Types.INTEGER);
        callate.setInt(1, almacen.getNumeroAlmacen());
        callate.setString(2,almacen.getUbicacionAlmacen());

        callate.executeUpdate();
        callate.close();
        // int pk=callate.getInt(1);
        System.out.println("Se actualizo el almacen");
        }catch(Exception e){
            System.out.println("se genero esta excepcion" + e.getMessage());
        }
        finally{
        //cerrar conexion, para evitar saturar la memoria 
        con.close();
        callate.close();
        // return pk;
    }
    }
    
public static Almacen buscarPorId (Integer id) throws Exception{
   
    Almacen almacen=new Almacen();
      Connection con=  Conexion.conectarse();
            
             try{
             
   Statement st= con.createStatement();
 ResultSet res=st.executeQuery("SELECT * FROM ALMACEN WHERE NUMERO_ALMACEN="+id);
 while(res.next()){
   Integer numeroAlmacen=  res.getInt(1);
   String nombreAlmacen=res.getString(2);
   almacen.setNumeroAlmacen(numeroAlmacen);
   almacen.setUbicacionAlmacen(nombreAlmacen);

   
     }
             }catch(Exception e){
                 
             }finally{
                  con.close();
             }

 return almacen;
  }
    





// sigue el select * from almacen
public static ArrayList<Almacen> buscarTodos() throws Exception{
    //paso 1 generamos el arraylist que contendra la tabla
    ArrayList<Almacen> tablitaAlmacen=new ArrayList<>();
    //paso 2 creamos la conexion
    Connection con=Conexion.conectarse();
    try {
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
    }catch (Exception e){
        
    }finally {
    con.close();
    }
    return tablitaAlmacen;
}

public static void Borrar (Integer id) throws Exception{
    Connection con = Conexion.conectarse();
    Statement st=con.createStatement();
    try{
        
        
        st.execute("DELETE * FROM ALMACEN WHERE NUMERO_ALMACEN ="+id);
        System.out.println("se ha eliminado el usuario");
    }catch (Exception e){
        System.out.println("no se han eliminda" + e.getMessage());
        
    }finally{
        st.close();
        con.close();
    }
}


}
