
package demot;


public class Vendedor extends Persona{
    
    int ht,pxh,com;

    public Vendedor(int ht, int pxh, int com, String nom, String sex, int edad) {
        super(nom, sex, edad);
        this.ht = ht;
        this.pxh = pxh;
        this.com = com;
    }
    
    
    public double sueldoNeto(){   
        return pxh*ht+com;
    }
    
    @Override
    public String Datos() {
        
       return  super.toString()+"\n"+" Horas trabajadas: " + ht+ ", Pago por Hora: " +pxh+", Comision: "+com;
    }
    
    
    
}
