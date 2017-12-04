
package demo0602;


public class Docente extends Persona {
    
    private double horas,tarifa;

    public Docente(String ap, String nom, int edad,double h ,double t) {
        super(ap, nom, edad);
        
        horas=h;
        tarifa=t;
    }
    
    
    
    /*METODO PROPIO DE LA CLASE*/
    public double calcularSueldo(){
    
        return horas*tarifa;
    }
    
    
    
    public String mostrarDatos(){
    
        return "Apellido: "+ap+" "+
                "Nombre: "+nom+" "+
                "Edad: "+edad+" "+
                "Horas: "+horas+" "+
                "Tarifa: "+tarifa+" ";
                           
    }
    
    
    
    
}
