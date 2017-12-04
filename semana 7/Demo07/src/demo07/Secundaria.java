
package demo07;


public class Secundaria extends Alumno implements InterfaceAlumno{
    
    private double nlab;

    public Secundaria() {
    }

    
    
    public double getNlab() {
        return nlab;
    }

    public void setNlab(double nlab) {
        this.nlab = nlab;
    }

    @Override
    public void mostrarDatos() {
        
        System.out.println(getCod()+" "+getApnom()+""+getSexo()+" "+getEdad()+""
                +getNivel()+""+getEp()+""+getEf()+""+getPp()+""+getNlab()+""+promedio());
      
    }

    @Override
    public double promedio() {
      
        return (getEp()+getEf()+getPp()+getNlab())/4;
    }
    
    
    
    
    
}
