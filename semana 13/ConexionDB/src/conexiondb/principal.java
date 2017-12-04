/*

 */
package conexiondb;
import java.sql.*;
import javax.swing.*;


public class principal {

    public static void main(String[] args) {
        
        try {
            
            //cargar la  clase de controlador de la bd
            Class.forName("com.mysql.jdbc.Driver");
            //crear el objeto de conexion a la bd
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/literatura2","root","");
            //Crear el objeto statement para realuizar consultas a la bd
            Statement  query = con.createStatement();
            //un objeto resultset, almacena los datos de resultados de una consulta
            ResultSet tabla = query.executeQuery("select * from autores");
            System.out.println(" LISTADO DE AUTORES ");
            System.out.println("---------------------------------------------------------------------");
            System.out.println("Codigo/autor/año. nac/año. fall/lugar fall./vida/estilo/ TrefEpoca");
            System.out.println("---------------------------------------------------------------------");
            
            while(tabla.next()){
                System.out.println(tabla.getInt(1)+"\t"+tabla.getString(2)+"\t"+tabla.getInt(3)+"\t"+tabla.getInt(4)+"\t"+tabla.getString(5)+"\t"+tabla.getString(6)+"\t"+tabla.getString(7)+"\t"+tabla.getString(8));
                
            }
            
            System.out.println("---------------------------------------------------------------------------------------------");
               
        } catch (ClassNotFoundException e) {
            
            System.out.println(e); 
        } catch (SQLException e) {
            
            System.out.println(e); 
            
        } catch (Exception e) {
            
            System.out.println(e); 
        }
        
        
      
    }
    
}
