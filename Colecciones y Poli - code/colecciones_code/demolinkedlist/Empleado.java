
package demolinkedlist;


public class Empleado {
    
    
    String  cod,apnon;
    double sb,bon,des;

    public Empleado(String cod, String apnon, double sb, double bon, double des) {
        this.cod = cod;
        this.apnon = apnon;
        this.sb = sb;
        this.bon = bon;
        this.des = des;
    }
    
    
    double neto(double a,double b,double c)
    {
        return a+b-c;
    }

   
    @Override
    public String toString() {
        return "Empleado{" + "cod=" + cod + ", apnon=" + apnon + ", sb=" + sb + ", bon=" + bon + ", des=" + des + '}';
    }
   
   
   
    
    
    
}
