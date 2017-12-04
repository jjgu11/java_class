package herencia5;
public class Figura {
    private double ancho; //Estas variables ahora
    private double altura; //son privadas
    //Un constructor por defecto
    public Figura()
    {
	this.ancho=this.altura=0.0;
    }
    //constructor parametrizado
    public Figura(double ancho, double altura) 
    {
        this.ancho = ancho;
        this.altura = altura;
    }
    //constructor con valores de ancho y altura al mismo parametro
    public Figura(double x)
    {
	this.ancho=this.altura=x;
    }
    //Metodos para accesar a ancho y altura
    public double getAncho() {
        return this.ancho;
    }
    public double getAltura() 
    {
        return this.altura;
    }
    void mostrarDimension()
    {
       System.out.println("El ancho y " +
             "el alto son "+this.ancho+" y "+this.altura);
    }
}










