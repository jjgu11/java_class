
package repasoef;


public class Ordinario extends Socios {

    public Ordinario(String apnom, String tipo, String cod, String sexo, String ec, Double cuotam, Double mora) {
        super(apnom, tipo, cod, sexo, ec, cuotam, mora);
    }
    
    


    @Override
    double mora() {
        
         return getCuotam()*0.1;
       
    }
    
    
    @Override
    double importe() {
       return getCuotam()+ mora();
    }
    
}
