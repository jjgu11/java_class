
package demo0301;

import javax.swing.JOptionPane;

/*Crear un programa que ingrese las notas de los alumnos de la universidad:
codigo, apellidos y nombres, curso (algoritmo o programacion), examen parcial, examen final,
promedio de practicas, promedio de exposiciones (solo para algoritmos), promedio de trabajo de campo (
solo para programacion), nota de cumplimiento (solo para proigramacion) se pide calcular e imprimir el promedio final de cada alumno y la 
cantidad de aprobados  y desarpobados para cada curso, aplique herencia*/

public class Principal {

   
    public static void main(String[] args) {
        
        int n,i, caa=0, cda=0,cap=0,cdp=0;
        String curso;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos"));
        
        for (i = 0; i < n ; i++) {
            
            curso = JOptionPane.showInputDialog("Ingrese el nombre del curso");
            
            if (curso.compareTo("algoritmos")==0){
                
                Alu_algoritmo alg = new Alu_algoritmo();
                alg.setCod(JOptionPane.showInputDialog("Ingrese el codigo del curso"));
                alg.setNom(JOptionPane.showInputDialog("Ingrese el apellidos y nombres"));
                alg.setEp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Examen Parcial")));
                alg.setEf(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Examen Final")));
                alg.setPp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Promedio de Parcticas")));
                
                alg.setPe(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Promedio de Exposiciones")));
                
                System.out.println("El promedio del alumno es : "+ alg.promedio());
                
                if(alg.promedio()>=11.5){
                    caa++;
                }else{
                    cda++;
                }
            }else{
                
                
                Alu_programacion prog = new Alu_programacion();
                prog.setCod(JOptionPane.showInputDialog("Ingrese el codigo del curso"));
                prog.setNom(JOptionPane.showInputDialog("Ingrese el apellidos y nombres"));
                prog.setEp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Examen Parcial")));
                prog.setEf(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Examen Final")));
                prog.setPp(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Promedio de Parcticas")));
                
                prog.setPtc(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Promedio de Trabajo de Campo")));
                prog.setNc(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Nota de Cumplimiento")));
                
                System.out.println("El promedio del alumno es : "+ prog.promedio());
                
                if(prog.promedio()>=11.5){
                    cap++;
                }else{
                    cdp++;
                }
            
            }
   
        }
        
            System.out.println("La cantidad de aprobados de Algoritmos es "+ caa);
            System.out.println("La cantidad de desaprobados de Algoritmos es "+ cda);
            System.out.println("La cantidad de aprobados de Programacion es "+ cap);
            System.out.println("La cantidad de aprobados de Programacion es "+ cdp);
        
      
    }
    
}
