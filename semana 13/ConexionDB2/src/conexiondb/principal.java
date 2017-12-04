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
        
        
        
// ELIMINAR REGISTRO
int cd=0;
String eliminar,codigo;   
   

try 
{  
    //Cargar clase de controlador de base de datos   
    Class.forName("com.mysql.jdbc.Driver");   
    //Crear el objeto de conexion a la base de datos   
    Connection conexion = DriverManager.getConnection("jdbc:mysql://"
            + "localhost/literatura2","root", "");   
    //Crear objeto Statement para realizar queries a la base de datos   
    Statement instruccion = conexion.createStatement();   
    //Un objeto ResultSet, almacena los datos de resultados de una consul
    cd=JOptionPane.showConfirmDialog(null,"Desea borrar algun registro?"
            + "","Java-MySQL",JOptionPane.YES_NO_OPTION);
    //Add
    ResultSet tabla = instruccion.executeQuery("select * from Autores"); 
    System.out.println("IdCodigo\tAutor\tFecha de Nac.\tFecha de Fallec."
    + "\tLugar de Nac.\tVida   \tEstilo  \tRefEpoca");  
    while(tabla.next())   
        System.out.println(tabla.getInt(1)+"\t"+tabla.getString(2)+
                "\t"+tabla.getInt(3)+"\t"+tabla.getInt(4)+"\t"
                +tabla.getString(5)+"\t"+tabla.getString(6)+"\t"+
                tabla.getString(7)+"\t"+tabla.getString(8));  
 }
    catch(ClassNotFoundException e){ System.out.println(e); }   
    catch(SQLException e){ System.out.println("La conexion con Mysql es "
            + "incorrecta"); }   
    catch(Exception e){ System.out.println(e); }  
    System.out.print("\n");
    System.out.print("\n");


    
if (cd==JOptionPane.YES_OPTION)
    
{
  eliminar=JOptionPane.showInputDialog("Ingrese el autor:");
  try
  {
    //Cargar clase de controlador de base de datos   
    Class.forName("com.mysql.jdbc.Driver");   
    //Crear el objeto de conexion a la base de datos   
    Connection conexion = DriverManager.getConnection("jdbc:mysql:"
              + "//localhost/literatura2", "root", "");   
    //Crear objeto Statement para realizar queries a la base de datos  
    Statement instruccion = conexion.createStatement();    
    ResultSet f= instruccion.executeQuery("SELECT autor FROM autores WHERE autor='"+eliminar+"'");
         f.next();
         System.out.println("Autor encontrado ...");
         codigo=f.getString("autor");
         instruccion.executeUpdate("DELETE FROM autores WHERE autor='"+codigo+"'");
         //Add
         ResultSet tabla = instruccion.executeQuery("select * from autores"); 
         System.out.println("IdCodigo\tAutor\tFecha de Nac.\tFecha de "
         + "Fallec.\tLugar de Nac.\tVida   \tEstilo  \tRefEpoca");  
         while(tabla.next())   
         System.out.println(tabla.getInt(1)+"\t"+tabla.getString(2)+
              "\t"+tabla.getInt(3)+"\t"+tabla.getInt(4)+"\t"
              +tabla.getString(5)+"\t"+tabla.getString(6)+"\t"+
              tabla.getString(7)+"\t"+tabla.getString(8));  
 
        }
        catch(ClassNotFoundException e){ System.out.println(e); }   
        catch(SQLException e){ System.out.println("No es un usuario de "
              + "la tabla autor"); }   
        catch(Exception e){ System.out.println(e); }
}

        






    
/*try
      { 
      //Cargar clase de controlador de base de datos   
      Class.forName("com.mysql.jdbc.Driver");   
     //Crear el objeto de conexion a la base de datos   
     Connection conexion = DriverManager.getConnection("jdbc:mysql://"
             + "localhost/colegio", "root", "");   
     //Crear objeto Statement para realizar queries a la base de datos   
     Statement instruccion = conexion.createStatement();   
     ResultSet tabla = instruccion.executeQuery("select *from alumo"); 
     System.out.println("zzzCodigo\tApellido\tProm\tExParcial");  
     while(tabla.next())   
        System.out.println(tabla.getString(1)+"\t"+tabla.getString(2)+
                "\t"+tabla.getString(3)+"\t"+tabla.getInt(4));  
     }
     catch(ClassNotFoundException e){ System.out.println(e); }   
     catch(SQLException e){ System.out.println("La conexion con Mysql "
             + "es incorrecta"); }   
     catch(Exception e){ System.out.println(e); }  
     System.out.print("\n");
     System.out.print("\n");
*/ 

        
      
    }
    
}
