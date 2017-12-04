
package repasoef;


public class Asociado extends Socios {
    
    

    public Asociado(String apnom, String tipo, String cod, String sexo, String ec, Double cuotam, Double mora) {
        super(apnom, tipo, cod, sexo, ec, cuotam, mora);
    }
    
   
    @Override
    double mora() {
        
        return getCuotam()*0.15;
       
    }
    
        @Override
    double importe() {
       
        return getCuotam()+ mora();
        
    }

    
    
    
}
