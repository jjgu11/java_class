/*TEMA: INTERFACE CON FORMULARIO
 DISEÑAR UN PROGRAMA  QUE INGRESE LOS DATOS  DE  N ARTICULOS DE UN ALMACEN: 
CODIGO
 DEL ARTICULO,
DESCRIPCION,
TIPO DE ARTICULO (PUEDE SER MECANICO, ELECTRICO O
 ELECTRONICO),
PRECIO UNITARIO, CANTIDAD, COSTO DE MANTENIMIENTO (SOLO PARA ELECTRICOS),
 COSTO DE TRANSPORTE (SOLO PARA ELECTRONICOS Y ELECTRICOS)
.SE PIDE IMPRIMIR UN  REPORTE CON LOS  DATOS DE ENTRADA QUE INCLUYA EL IMPORTE NETO DE CADA ARTICULO.
 APLIQUE INTERFACE CON FORMULARIO.
 */
package PaqueteArticulos;


public class Electrico extends Articulo implements InterfaceArticulos  {
    private double cm,ct;

    public Electrico() {
    }

    public Electrico(double cm, double ct, String cod, String des, String tipo, double preu, int cant) {
        super(cod, des, tipo, preu, cant);
        this.cm = cm;
        this.ct = ct;
    }
    
    

    public double getCm() {
        return cm;
    }

    public void setCm(double cm) {
        this.cm = cm;
    }

    public double getCt() {
        return ct;
    }

    public void setCt(double ct) {
        this.ct = ct;
    }
    
    public double Importe(){
    return getPreu()*getCant()+getCm()+getCt();
    }
    
    
    
    
    
    
}
