package herencia3;
public class Figura
{
    private double ancho; //Estos ahora
    private double altura; //son privados
    //Metodos para accesar a ancho y altura
    public double getAncho() {
        return ancho;
    }
    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    public double getAltura() {
        return altura;
    }
    public void setAltura(double altura) {
        this.altura = altura;
    }
    void mostrarDimension()
    {
 	System.out.println("El ancho y el " +
                "alto son "+ancho+" y "+altura);
    }
}









