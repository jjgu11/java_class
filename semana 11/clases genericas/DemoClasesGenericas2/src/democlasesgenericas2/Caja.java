
package democlasesgenericas2;


public class Caja<T> {
    
    
    private T dato;

    public Caja() {
        
        super();
    }
    
    public T quitar(){
    
        return dato;
    }
    
    
    public void poner(T d){
    
        dato=d;
        
    }
    
    
    
    
    
}
