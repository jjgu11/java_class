
public class Articulo_Mec extends Articulo {

    private double costo_tras;
    
    public Articulo_Mec() {
    }
    
    

    public double getCosto_tras() {
        return costo_tras;
    }

    
    public void setCosto_tras(double costo_tras) {
        this.costo_tras = costo_tras;
    }
    
    
    public double importe(){
        return this.costo_tras+getPre_uni()*getCant();
    }
    
    
    
    
    

    
}
