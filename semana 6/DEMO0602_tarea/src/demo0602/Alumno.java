
package demo0602;


public class Alumno extends Persona{
    
    private double nota1,nota2,nota3;

    public Alumno(String ap, String nom, int edad,double nota1, double nota2, double nota3) {
        super(ap, nom, edad);
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    
    /*METODO PROPIO DE LA CLASE*/
    public double calcularPromedio(){
         
        return (nota1+nota2+nota3)/3;
    
    }
    
    public String mostrarDatos(){
        
            return "Apellido: "+ap+" "+
                "Nombre: "+nom+" "+
                "Edad: "+edad+" "+
                "Nota1: "+nota1+" "+
                "Nota2: "+nota2+" "+
                "Nota3: "+nota3+" ";
    
    }
    
    

  
    
    
    
}
