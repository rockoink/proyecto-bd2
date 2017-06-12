/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bd2.modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.*;

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
   
public  void buscarPorId (Almacen almacen) throws Exception{
    Connection con=Conexion.conectarse();
    
    CallableStatement cs=con.prepareCall("{}");
}   
    
}
