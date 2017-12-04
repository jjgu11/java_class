package herencia2;

class Triangulo extends Figura
{
    String tipo;
    double area()
    {
	return getAncho()*getAltura()/2;
    }
    void mostrarTipo()
    {
	System.out.println("Triangulo es "+tipo);
    }
}