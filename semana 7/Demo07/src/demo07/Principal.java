/*
REALIZAR EL PROGRAMA QUE INGRESE  LOS DATOS DE LOS ALUMNOS DE UN COLEGIO:
CODIGO DEL ALUMNO, APELLDOS Y NOMBRES,EDAD,SEXO,NIVEL DE ESTUDIO(PUEDE SER
PRIMARIA O SECUNDARIA),EXAMEN PARCIAL, EXAMEN FINAL, PROMEDIO DE PRACTICAS 
Y PROMEDIO DE LABORATORIO (SOLO PARA ALUMNOS DE NIVEL SECUNDARIA)
SE PIDE CREAR 2 CLASES PRIMARIA Y SECUNDARIA Y UNA INTERFACE QUE CONTENGA
LOS METODOS A MOSTERAR DATOS Y CALCUALR EL PROMMEDIO QUE SERA IMPLEMENTADA
PARA LAS CLASES PRIMARIAS Y SECUNDARIAS 
*/
package demo07;

import javax.swing.JOptionPane;

public class Principal {

  
    public static void main(String[] args) {
       
        int n,i;
        String nivel;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingresar la cantidad de Alumnos"));
        
        
        for ( i = 1; i < 10; i++) {
            
            nivel = JOptionPane.showInputDialog("Ingrese el nivel de estudio");
            
            if(nivel.compareTo("primaria")==0){
                
                Primaria pri = new Primaria();
                
                pri.setCod(JOptionPane.showInputDialog("Ingrese el codigo"));
                pri.setApnom(JOptionPane.showInputDialog("Ingrese apellido y nombres"));
                pri.setSexo(JOptionPane.showInputDialog("Ingrese sexo"));
                pri.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
                pri.setNivel(nivel);
                pri.setEp(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Examen Parcial")));
                pri.setEf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Examen Final")));
                pri.setPp(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Promedio de Practicas")));
                
                pri.mostrarDatos();
                
                
                    
            }else{
                
                 Secundaria sec = new Secundaria();
                
                sec.setCod(JOptionPane.showInputDialog("Ingrese el codigo"));
                sec.setApnom(JOptionPane.showInputDialog("Ingrese apellido y nombres"));
                sec.setSexo(JOptionPane.showInputDialog("Ingrese sexo"));
                sec.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad")));
                sec.setNivel(nivel);
                sec.setEp(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Examen Parcial")));
                sec.setEf(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el Examen Final")));
                sec.setPp(Integer.parseInt(JOptionPane.showInputDialog("Ingrese Promedio de Practicas")));
                sec.setNlab(Integer.parseInt(JOptionPane.showInputDialog("Ingrese las Notas de Laboratorios")));
                
                
                sec.mostrarDatos();
            }
            
        }
        
    }
    
}
