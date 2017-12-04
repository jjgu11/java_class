package herencia5;
class Triangulo extends Figura
{
   private String tipo;
   //Un constructor por defecto
   public Triangulo()
   {
     super();
     this.tipo="null";
   }
   //constructor
   public Triangulo(String tipo, double ancho, double altura) 
   {
      super(ancho, altura);
      this.tipo = tipo;
    }
    //constructor para triangulo isosceles
    public Triangulo(double x) 
    {
       super(x);
       this.tipo="isosceles";
    }
    double area()
    {
       return getAncho()*getAltura()/2;
    }
    void mostrarTipo()
    {
       System.out.println("Triangulo es "+this.tipo);
    }
}