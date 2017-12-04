package herencia3;
class Triangulo extends Figura
{
	private String tipo;
	//constructor
	Triangulo(String t,double a,double h)
	{
		setAncho(a);
		setAltura(h);
		tipo=t;
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