
package demo0301;

/* extends - para heredar del padre Alumno
    y por los metodos GET accedemos a las variables privadas de la Clase Padre
    

*/
public class Alu_algoritmo extends Alumno {
    
    private double pe;

    
    /*CONSTRUCTOR*/
    public Alu_algoritmo() {
    }

    
    
    /*METODOS GETTER Y SETTER*/
    public double getPe() {
        return pe;
    }

    public void setPe(double pe) {
        this.pe = pe;
    }
    
    
    
    /*METODO PROMEDIO*/
    public double promedio(){
    
        return (getEp()+getEf()+getPp()+this.pe)/4;
    }
    
    
    
}
