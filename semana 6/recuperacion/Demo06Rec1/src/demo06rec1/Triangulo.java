
package demo06rec1;


public class Triangulo extends Figura{
    
    
    String tipo;

    double area(){
        
        return getAncho()*getAlto()/2;
    }
    
    void mostrarTipo(){
        
        System.out.println("Triangulo es tipo "+ tipo);
    }
    
}
