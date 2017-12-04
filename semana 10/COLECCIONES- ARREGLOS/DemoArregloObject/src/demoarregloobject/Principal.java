
package demoarregloobject;

import javax.swing.JOptionPane;

/*
TEMA : ARREGLO DE OBJETO
Realizar el programa que ingrese a un arreglo de objeto
los datos de los articulos de un almacen:
codigo, descripcion, precio unitario, cantidad y tipo de 
articulo.
Se pide imprimir un reporte con los datos de enterada
que incluya el importe de cada articulo y al pie del reporte
se debera imprimir el total de importes por tipo puede ser 
(mecanico, electrico o electronico). Aplique clases, objetos, metodos y 
contructor
*/

public class Principal {

   
    public static void main(String[] args) {
       
        int n;
        n=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Articulos"));
        
        Articulo art[] = new Articulo[n];
        
        for (int i = 0; i < n; i++) {
            
            art[i] = new Articulo();         
            
        }
        
        reporte (art,n);
        
        
    }
    
    static void reporte(Articulo xart[],int xn){
    
        double totMec=0,totElec=0,totElecn=0;
        
        System.out.println("REPORTE DE ARTICULOS");
        System.out.println("---------------------------------------------------------");
        System.out.println("CODIGO   DESCRIPCION   TIPO    PRE.UNI   CANT    IMPTE");
        System.out.println("---------------------------------------------------------");
        
        for (int i = 0; i < xn; i++) {
                
            System.out.println(xart[i].cod+"   "+xart[i].desc+"   "+xart[i].tipo+"   "+xart[i].pu+"   "+xart[i].cant+"   "+xart[i].importe()+"   ");
            
            if(xart[i].tipo.compareTo("mecanico")==0){
                
                totMec=totMec+xart[i].importe();
                
            }else if(xart[i].tipo.compareTo("electrico")==0){
                
                    totElec=totElec+xart[i].importe();
            }else{
                
                    totElecn=totElecn+xart[i].importe();
            }
            
            
        }/*fin for*/
        
        
        System.out.println("---------------------------------------------------------");
        System.out.println("Total Importe Mecanico"+totMec);
        System.out.println("Total Importe Electrico"+totElec);
        System.out.println("Total Importe Electronico"+totElecn);
        
        
        
    }
    
    
    
    
}
