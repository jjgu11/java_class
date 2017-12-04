
package demo07.interfaceform;

public class Electronico extends Articulo implements  InterfaceArt{
    
    
    private double costo_trans;

    public Electronico() {
    }

    public double getCosto_trans() {
        return costo_trans;
    }

    public void setCosto_trans(double costo_trans) {
        this.costo_trans = costo_trans;
    }

    @Override
    public Double ImporteNeto() {
        
        return getPre_uni()*getCant()+getCosto_trans();
        
    }
    
    
    
    
}
