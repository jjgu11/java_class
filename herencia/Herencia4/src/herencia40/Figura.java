package herencia40;
public class Figura {
        private double ancho; //Estas variables ahora
	private double altura; //son privadas
	//constructor parametrizado

        public Figura(double ancho, double altura) {
          this.ancho = ancho;
          this.altura = altura;
       }
	//Metodos para accesar a ancho y altura
	public double getAncho() {
           return ancho;
        }
        public double getAltura() {
          return altura;
        }
        void mostrarDimension()
	{
		System.out.println("El ancho y el " +
                "alto son "+ancho+" y "+altura);

	}
}
