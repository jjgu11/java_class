
package demo06rec;

public class Principal {

 
    public static void main(String[] args) {
        
        
        Triangulo t1 = new Triangulo();
        Triangulo t2 = new Triangulo();
        
        
        t1.ancho = 4.0;
        t1.alto = 4.0;
        t1.tipo = "";
       
        t2.ancho = 4.0;
        t2.alto = 4.0;
        t2.tipo = "";
        
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
