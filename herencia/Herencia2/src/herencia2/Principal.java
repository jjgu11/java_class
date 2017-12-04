package herencia2;
public class Principal {
public static void main(String args[])
{
    Triangulo t1=new Triangulo();
    Triangulo t2=new Triangulo();

    t1.setAncho(4.0);
    t1.setAltura(4.0);
    t1.tipo="isosceles";

    t2.setAncho(8.0);
    t2.setAltura(12.0);
    t2.tipo="rectangulo";

    System.out.println("Informacion para t1");
    t1.mostrarTipo();
    t1.mostrarDimension();
    System.out.println("El area es "+t1.area());
    System.out.println();

    System.out.println("Informacion para t2");
    t2.mostrarTipo();
    t2.mostrarDimension();
    System.out.println("El area es "+t2.area());
}
}








