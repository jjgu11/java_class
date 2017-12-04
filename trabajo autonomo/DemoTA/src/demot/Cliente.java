
package demot;


public class Cliente extends Persona {
    
    String pro;
    int cant;
    double pre,desc;

    
    public Cliente(String pro, double pre, int cant, double desc, String nom, String sex, int edad) {
        super(nom, sex, edad);
        this.pro = pro;
        this.pre = pre;
        this.cant = cant;
        this.desc = desc;
    }
    
    public Double PagoProduct(){
        
        return pre*cant-desc;
    }

    @Override
    public String Datos() {
     return  super.toString()+"\n"+", Producto: "+pro+", Precio: " + pre+ ", Cantidad: " +cant+", Descuento: "+desc;
    }
    
    
    

    

    
    
    
}
