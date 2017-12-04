
package demolinkedlist;


public class Tecnico extends Empleado {

    double rv;

    public Tecnico(double rv, String cod, String apnon, double sb, double bon, double des) {
        super(cod, apnon, sb, bon, des);
        this.rv = rv;
    }
    
    double netot(double a,double b,double c,double d)
    {
        return a+b+d-c;
    }

    @Override
    public String toString() {
        return "Tecnico{"  + "cod=" + cod + ", apnon=" + apnon + ", sb=" + sb + ", bon=" + bon + ", des=" + des + "rv=" + rv + '}';
    }
    

    
    
    
    

    
}
