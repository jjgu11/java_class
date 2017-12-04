
package repasoef;

import javax.swing.JOptionPane;

public class Principal {

  
    public static void main(String[] args) {
        
        
        String apnom,tipo,cod,sexo,ec;
        Double cuotam,mora,impoEsp;
        
        tipo = JOptionPane.showInputDialog("Ingrese el tipo de Socio");
        
        
        if(tipo.compareTo("asociado")==0){
            
            //paso los datos de los atributos de la clase
            apnom = JOptionPane.showInputDialog("Ingrese el nombre y apellido");
            cod = JOptionPane.showInputDialog("Ingrese el codigo");
            sexo = JOptionPane.showInputDialog("Ingrese el sexo");
            ec = JOptionPane.showInputDialog("Ingrese el estado civil");
            
            cuotam = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual"));
            mora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la mora"));
            
            //creo el arreglo de objeto
            Asociado soc[] = new Asociado[50];
        
            for (int i = 0; i <50 ; i++) {
                soc[i] = new Asociado(apnom, tipo, cod, sexo, ec, cuotam, mora);
            }
            
            //imprimo los datos

        
        }else if (tipo.compareTo("ordinario")==0){
            
            //paso los datos de los atributos de la clase
            apnom = JOptionPane.showInputDialog("Ingrese el nombre y apellido");
            cod = JOptionPane.showInputDialog("Ingrese el codigo");
            sexo = JOptionPane.showInputDialog("Ingrese el sexo");
            ec = JOptionPane.showInputDialog("Ingrese el estado civil");
            
            cuotam = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual"));
            mora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la mora"));
            
            //creo el arreglo de objeto
            Ordinario ord[] = new Ordinario[50];
        
            for (int i = 0; i <50 ; i++) {
                ord[i] = new Ordinario(apnom, tipo, cod, sexo, ec, cuotam, mora);
            }
            
            //imprimo los datos
            
        
        
        }else{
            
            //paso los datos de los atributos de la clase
            apnom = JOptionPane.showInputDialog("Ingrese el nombre y apellido");
            cod = JOptionPane.showInputDialog("Ingrese el codigo");
            sexo = JOptionPane.showInputDialog("Ingrese el sexo");
            ec = JOptionPane.showInputDialog("Ingrese el estado civil");
            
            cuotam = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la cuota mensual"));
            mora = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la mora"));
            
            //atributo adicional de la clase
            impoEsp = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la mora"));
            
            //creo el arreglo de objeto
            Exclusivo ord[] = new Exclusivo[50];
        
            for (int i = 0; i <50 ; i++) {
                ord[i] = new Exclusivo(impoEsp,apnom, tipo, cod, sexo, ec, cuotam, mora);
            }
            
            //imprimo los datos  
        
        }
            
    }
    
    
    //metodos
    
    static void reporte_datos_socio(){
    
    
    
    }
    
    
    static void reporte_tpagar_socio(){
    
            
    }
    
    
    static void reporte(){
    
            
    }
    
}
