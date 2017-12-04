
package demoarraylist;


public class Empleado {
    
    
    String  cod;
    double sb,bon,des;

    public Empleado() {
    }
   
    
    double sn(double a,double b,double c){
    
        return a+b-c;
    }

    @Override
    public String toString() {
        return "Empleado{" + "cod=" + cod + ", sb=" + sb + ", bon=" + bon + ", des=" + des + '}';
    }
    
    
    
    
    
    
    
}
