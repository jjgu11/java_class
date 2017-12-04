
package demo07.interfaceform;


public class Mecanico extends Articulo implements  InterfaceArt{

    @Override
    public Double ImporteNeto() {
        
        return getPre_uni()*getCant();
        
    }
    
    
    
    
    
    
    
}
