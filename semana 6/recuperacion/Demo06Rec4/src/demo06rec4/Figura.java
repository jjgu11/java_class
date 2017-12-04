
package demo06rec4;


public class Figura {
    
    
    private double ancho;
    private double alto;
    
    

    public Figura(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    

    public double getAncho() {
        return ancho;
    }

    public double getAlto() {
        return alto;
    }


    
     void mostrarDimension(){
    
        System.out.println("El ancho y el alto son "+ancho+" "+alto);
    }
    
}
