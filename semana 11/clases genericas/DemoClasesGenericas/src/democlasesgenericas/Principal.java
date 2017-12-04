
package democlasesgenericas;

/* CLASES GENERICAS 
    OBJECT
*/
public class Principal {

   
    public static void main(String[] args) {
    
        Caja c = new Caja();
        c.poner(45);
        Integer x = (Integer)c.quitar();
        System.out.println(x);
        
        Caja c2 = new Caja();
        c2.poner(3.254);
        Double x2 = (Double)c2.quitar();
        System.out.println(x2);
        
        
        Caja c3 = new Caja();
        c3.poner("hola");
        String x3 = (String)c3.quitar();
        System.out.println(x3);
          
    }
    
}
