
package demo06rec4;

public class Principal {

    public static void main(String[] args) {
         Triangulo t1 = new Triangulo("",4.0,4.0);
        Triangulo t2 = new Triangulo("",4.0,4.0);
        
        System.out.println("Infomacion para T1");
        t1.mostrarTipo();
        t1.mostrarDimension();
        System.out.println("El area es "+ t1.area());
        
        System.out.println("Infomacion para T2");
        t2.mostrarTipo();
        t2.mostrarDimension();
        System.out.println("El area es "+ t2.area());
    }
    
}
