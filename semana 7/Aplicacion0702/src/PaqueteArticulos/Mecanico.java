
package PaqueteArticulos;


public class Mecanico extends Articulo implements InterfaceArticulos {

    public Mecanico(String cod, String des, String tipo, double preu, int cant) {
        super(cod, des, tipo, preu, cant);
    }
    
    
    
    public double Importe()
    {
           return getPreu()*getCant();
    }
}
