/*
DSEÑAR UN PROGRAMA QUE INGRESE LOS DATOS DE N ALUMNOS DE UNA UNIVERSIDAD: CODIGO DE ALUMNO,APELLIDOS, NOMBRES, SEXO, AÑOS DE ESTUDIOS
CARRERA(PUEDE SER ING, MEDICINA O ADMINISTRACION), EXAMEN PARCIAL, EXAMEN FINAL, PROMEDIO DE PRACTICAS, NOTAS DE LABORATORIO(SOLO PARA ALUMNOS DE MEDICINA),
NOTAS DE MEDICINA)NOTAS DE TRABAJO DE CAMPO (SOLO PARA ALUMNOS DE INMGENIERIA), NOTAS DE GESTION, (SOLO PARA ALUMNOS DE INGENIERIA).
SE PIDE IMPRIMIR UN REPORTE CON LOS DATOS DE ENTRADA QUE INCLUYA EL PROMEDIO FINAL DE CADA ALUMNO, APLIQUE SOBRECARGA DE METODOS
*/
package demo06;

import javax.swing.JOptionPane;


public class Principal {

  
    public static void main(String[] args) {
        
        int n,i;
        String cod,apnom,sexo,carre;
        int ae;
        double ep,ef,pp,nlab,ntc,ng;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos"));
        
        for ( i = 1; i <=n; i++) {
            
            cod = JOptionPane.showInputDialog("Ingrese el codigo del alumnos");
            apnom = JOptionPane.showInputDialog("Ingrese el nombre del alumnos");
            sexo = JOptionPane.showInputDialog("Ingrese el sexo del alumnos");
            carre = JOptionPane.showInputDialog("Ingrese la carrera del alumnos");
            ae = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el año de estudios"));
            ep =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exammen parcial del alumno"));
            ef =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el exammen final del alumno"));
            pp =Double.parseDouble(JOptionPane.showInputDialog("Ingrese el promedio de practicas del alumno"));
            
            
            if(carre.compareTo("administracion")==0){
                
                Alumno adm = new Alumno(cod, apnom, sexo, carre, ae, ep, ef, pp);
                System.out.println("El promedio del alumno de administracion es"+ adm.promedio(ep, ef, pp));
            
            
            }else if(carre.compareTo("medicina")==0){
                
                nlab = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota del laboratorio del alumno"));
                Alumno med = new Alumno(cod, apnom, sexo, carre, ae, ep, ef, pp, nlab);
                System.out.println("el promedio del alumno de medicina es" + med.promedio(ep, ef, pp, nlab));
        
            }else{
                
                ntc = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota detrabajo de campo del alumno"));
                ng = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota de gestion del alumno"));
                Alumno ing = new Alumno(cod, apnom, sexo, carre, ae, ep, ef, pp, ntc, ng);
                System.out.println("el promedio del alumno de ingenieria es" + ing.promedio(ep, ef, pp, ntc, ng));

            }
   
        }
        
    }
    
}
