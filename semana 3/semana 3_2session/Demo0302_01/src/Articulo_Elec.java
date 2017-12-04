
public class Articulo_Elec extends Articulo {
    
    private double costo_mat;
    
    public Articulo_Elec() {
    }

    public double getCosto_mat() {
        return costo_mat;
    }

    public void setCosto_mat(double costo_mat) {
        this.costo_mat = costo_mat;
    }
    
    
    public double importe(){
        
        return getCant()* getPre_uni()+ this.costo_mat;
    }
    
    
    
    
    
    
}
