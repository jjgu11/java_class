
package demo0401;


public class Tecnico extends Empleado{
    
   private double rv;

   
    public Tecnico() {
    }

    
    public double getRv() {
        return rv;
    }

    public void setRv(double rv) {
        this.rv = rv;
    }

    
    //*polimorfismo - metodo implementado de la SuperClase*/
    @Override
    public Double sn() {
       
        return this.getSb()+this.getB()+getRv()-this.getDes();
        
    }
    
    
   
    
    
   
    
    
}
