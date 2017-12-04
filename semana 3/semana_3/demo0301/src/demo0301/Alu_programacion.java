
package demo0301;


public class Alu_programacion extends Alumno{
    
    
    private double ptc,nc;

    
    /*CONSTRUCTOR*/
    public Alu_programacion() {
    }

    
    
    /*METODOS GETTER Y SETTER*/
    public double getPtc() {
        return ptc;
    }

    public void setPtc(double ptc) {
        this.ptc = ptc;
    }

    public double getNc() {
        return nc;
    }

    public void setNc(double nc) {
        this.nc = nc;
    }
    
    
    /*METODO PROMEDIO*/
    public double promedio(){
    
        return (getEp()+getEf()+getPp()+this.nc+this.ptc)/5;
    }
    
    
    
    
}
