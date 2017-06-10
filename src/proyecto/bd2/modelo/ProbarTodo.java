/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.bd2.modelo;

/**
 *
 * @author T-
 */
public class ProbarTodo {
    
    public static void main(String[] args) {
    
        //vamos a probar nuestro DAOAlmacen
        //operacion guardar
        
        //creamos el almacen que necesita guardar el DAO
        
        Almacen a1=new Almacen(5,"Ecatepec");
        
        //creamos el objeto DAO almacen
        
       DAOAlmacen dao=new DAOAlmacen();
       
       //LE ENVIAMOS EL MESNAJE PARA QUE GUARDE EL ALMACEN
       try {
        dao.guardar(a1);
           System.out.println("se guardo perfectamente en el cliente");  
       }catch (Exception e){
           System.out.println("hubo error"+e.getMessage());
    }
    
    }
}
