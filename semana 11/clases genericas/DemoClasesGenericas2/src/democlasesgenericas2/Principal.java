
package democlasesgenericas2;


public class Principal {

   
    public static void main(String[] args) {
       
        Caja<Integer> c = new Caja<>();
        
        c.poner(45);
        Integer x = c.quitar();
        System.out.println(x);
        
        
        Caja<String> c2 = new Caja<>();
        
        c2.poner("hola");
        String x2 = c2.quitar();
        System.out.println(x2);
        
        
        Caja<Double> c3 = new Caja<>();
        
        c3.poner(4.2255);
        Double x3 = c3.quitar();
        System.out.println(x3);
        
        
        
        
        
        
    }
    
}
