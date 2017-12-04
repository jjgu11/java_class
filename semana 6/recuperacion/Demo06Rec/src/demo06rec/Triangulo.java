
package demo06rec;

public class Triangulo extends Figura {
    
    String tipo;

    double area(){
        
        return ancho*alto/2;
    }
    
    void mostrarTipo(){
        
        System.out.println("Triangulo es tipo "+ tipo);
    }
    
}
