
package repasoef;


public class Exclusivo extends Socios {
    
    double impoEsp;

    
    public Exclusivo(double impoEsp, String apnom, String tipo, String cod, String sexo, String ec, Double cuotam, Double mora) {
        super(apnom, tipo, cod, sexo, ec, cuotam, mora);
        this.impoEsp = impoEsp;
    }
    
    
    @Override
    double mora() {
       
         return getCuotam()*0.2;
    }
    
    
    @Override
    double importe() {
       
        return  getCuotam()+ mora()+this.impoEsp;
        
    }
    
    
    
}
