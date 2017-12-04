package herencia40;
class Triangulo extends Figura
{
  private String tipo;
  //constructor
  public Triangulo(String tipo, double ancho, double altura) 
  {
      super(ancho, altura);
      this.tipo = tipo;
  }
  double area()
  {
      return getAncho()*getAltura()/2;
  }
  void mostrarTipo()
  {
		System.out.println("Triangulo es "+tipo);
  }
}