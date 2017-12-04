
package PaqueteArticulos;


public class Electronico extends Articulo implements InterfaceArticulos{
    private double ct;

    public Electronico() {
    }

    public Electronico(double ct, String cod, String des, String tipo, double preu, int cant) {
        super(cod, des, tipo, preu, cant);
        this.ct = ct;
    }
    

    public double getCt() {
        return ct;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }
            
    public double Importe()
    {
    return getPreu()*getCant()+getCt();
    }
    
}
