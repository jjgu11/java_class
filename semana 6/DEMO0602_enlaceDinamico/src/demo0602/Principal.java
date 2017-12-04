

/*TEMA: POLIMORFISMO: ENLACE DINAMICO

REALIZAR LA APLICACION QUE INGRESE LOS DATOS DE UN DOCENTE Y UN ALUMNO
PARA EL CASO DEL DOCENTE Y ALUMNO SE ASIGNARAN DIRECTAMENTE DESDE LA 
CREACION DEL OBJETO LO SIGUIENTE:
DATOS : DOCENTE (APELLIDOS: GALVEZ, NOMBRE: RICARDO, EDAD: 35 AÑOS,
HORAS TRABAJADAS: 100, TARIFA 40 NUEVOS SOLES HORA),
ALUMNO (APELLIDOS: SALAZAR, NOMBRE: SANDRA, EDAD: 20 AÑOS, EXA. PARCIAL: 14,
E.FINAL: 16, PROM.PARCT: 13)

SE PIDE IMPRIMIR LOS DATOS DE LAS PERSONAS Y SU CALCULO RESPECTIVO DE 
SUELDO O PROMEDIO SEGUN CORRESPONDA.

EL PROGRAMA DEBERA UTILIZAR UNA CLASE PADRE LLAMADA PERSONA Y DOS CLASES
HIJAS LLAMADAS DOCENTES*/



package demo0602;

import javax.swing.JOptionPane;

public class Principal {

    
    public static void main(String[] args) {
        
       /*Docente obj1 = new Docente("Galvez","Ricardo",35,100,40);
        listar(obj1);       
    
        Alumno obj2 = new Alumno("Salazar","Sandra",20,14,16,13);
        listar(obj2);
        */        
        int i,n,edad,horas,tarifa,nota1,nota2,nota3;
        String persona,nom,ape;
        
        n = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Personas"));
        
        for (i = 1; i <=n; i++) {
            
            persona = JOptionPane.showInputDialog("Ingrese el tipo de Persona");
            
            if (persona.compareTo("docente")==0){
                
                /*Constructor general del la superclase*/
                nom = JOptionPane.showInputDialog("Ingrese el nombre de la Persona");
                ape = JOptionPane.showInputDialog("Ingrese el apellido de la Persona");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la Persona"));
                
                /*Atributos presentes en el constructor de la propia Clase Docente*/
                horas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de horas"));
                tarifa = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tarifa por hora"));
                
                /*Constructor de la clase Docente*/
                Docente obj1 = new Docente(nom,ape,edad,horas,tarifa);
                listar(obj1);
                                     
                
            }else{
                
                /*Constructor general del la superclase*/
                nom = JOptionPane.showInputDialog("Ingrese el nombre de la Persona");
                ape = JOptionPane.showInputDialog("Ingrese el apellido de la Persona");
                edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad de la Persona"));
                
                /*atributos presentes en el constructor de la propia Clase Alumno*/
                nota1 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota1 del Alumno"));
                nota2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota2 del Alumno"));
                nota3 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota3 del Alumno"));
                
                
                /*Constructor de la clase Alumno*/
                Alumno obj2 = new Alumno(nom,ape,edad,nota1,nota2,nota3);
                listar(obj2);
                            
            }
             
            
        }/*------> Fin For()*/
            
    }
    
    /*LISTAR ES UN METODO PILIMORFICO*/
    static void listar(Persona x){
            
        System.out.println("Datos "+x.mostrarDatos());
        System.out.println("Su correo es "+x.generaCorreo());
            
        if( x instanceof Docente){
                
            System.out.println("Sueldo: "+" "+((Docente)x).calcularSueldo());
            
        }else{
            System.out.println("Sueldo: "+" "+((Alumno)x).calcularPromedio());
        }
            
    }

    /*MODIFICAR EL PROGRAMA PARA QUE SE INGRESE DESDE TECLADO LOS DATOS DE N PERSONAS
    (DOCENTE O ALUMNOS) E IMPRIMIR UN REPORTE CON TODOS SUS DATOS Y AL PIE DEL REPORTE
    IMPRIMIR EL TOTAL DE SUELDO DE LOS DOCENTES Y LA CANTIDAD DE APROBADOS Y DESAPROBADOS DE LOS ALUMNOS*/
    
    
       
    
    
}
