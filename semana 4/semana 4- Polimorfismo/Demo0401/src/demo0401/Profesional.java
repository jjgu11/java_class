
package demo0401;


    public class Profesional extends Empleado {
        
    private Double besp;

    public Profesional() {
    }

    
   
    public Double getBesp() {
        return besp;
    }

    public void setBesp(Double besp) {
        this.besp = besp;
    }
    
    
    /*polimorfismo - metodo implementado de la SuperClase*/
        @Override
    public Double sn() {
       
       return  getSb()+getB()-getDes()+getBesp();
        
    }

    
    
  
    
    
}
