/*DISEÑAR UN PROGRAMA QUE INGRESE LOS DATOS DE LOS ALUMNO DE UNA COLEGIO A UNA 
 LISTA ENLAZADA: CODIGO, APELLIDOS Y NOMBRES, EXAMEN PARCIAL, EXAMEN FINAL Y 
 PROMEDIO DE PRACTICA y nivel (puede ser primaria o secundaria), nota de exposicion
(solo para secundaria). SE PIDE IMPRIMIR UN REPORTE CON LOS DATOS DE ENTRADA DE 
 LOS ALUMNOS ASI COMO EL PROMEDIO FINAL DE CADA ALUMNO. APLIQUE HERENCIA.
 */
package aplicacion0902;

import javax.swing.JOptionPane;

public class Principal {
    static class Nodo
    {
        Alumno alum=new Alumno();
        Nodo sig;
    }

    public static void main(String[] args) {
        Nodo comienzo=null;
        Nodo nuevo=null;
        Nodo q=null;
        String cod;
        cod=JOptionPane.showInputDialog("Ingrese el codigo del alumno:");
        while(cod.compareTo("*")!=0)
        {
           nuevo=new Nodo();
           nuevo.alum.setCod(cod);
           nuevo.alum.setApnom(JOptionPane.showInputDialog("Ingrese apellidos y nombres"));
           nuevo.alum.setEp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese examen parcial")));
           nuevo.alum.setEf(Double.parseDouble(JOptionPane.showInputDialog("Ingrese examen final")));
           nuevo.alum.setPp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese promedio de practica")));
           if(comienzo==null)
           {
               comienzo=nuevo;
           }
           else
           {
              q=comienzo;
              while(q.sig!=null)
              {
                q=q.sig;
              } 
              q.sig=nuevo;
           }
           nuevo.sig=null;
           cod=JOptionPane.showInputDialog("Ingrese el codigo");
        }
        reporte(comienzo);
    }
    public static void reporte(Nodo xcomienzo)
    {
       while(xcomienzo!=null)
       {
         System.out.println(xcomienzo.alum.getCod()+" "+xcomienzo.alum.getApnom()+" "
                 +xcomienzo.alum.getEp()+" "+xcomienzo.alum.getEf()+" "
                 +xcomienzo.alum.getPp()+" "+xcomienzo.alum.promedio());  
         xcomienzo=xcomienzo.sig;
       }    
    }        
    
}
