
package demo07.interfaceform;


public class Electrico extends Articulo implements  InterfaceArt{
    
    private double costo_mant;    
    private double costo_trans;

    public Electrico() {
    }

    public double getCosto_mant() {
        return costo_mant;
    }

    public void setCosto_mant(double costo_mant) {
        this.costo_mant = costo_mant;
    }

    public double getCosto_trans() {
        return costo_trans;
    }

    public void setCosto_trans(double costo_trans) {
        this.costo_trans = costo_trans;
    }


    @Override
    public Double ImporteNeto() {
        
        return getPre_uni()*getCant()+getCosto_mant()+getCosto_trans();
    }
    
    
 
 
    
}
