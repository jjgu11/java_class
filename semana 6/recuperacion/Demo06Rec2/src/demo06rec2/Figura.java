
package demo06rec2;


public class Figura {
    
    
    private double ancho;
    private double alto;


    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }
    
    
     void mostrarDimension(){
    
        System.out.println("El ancho y el alto son "+ancho+" "+alto);
    }
    
}
