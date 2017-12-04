
package demo07;


public class Primaria extends Alumno implements InterfaceAlumno{

    public Primaria() {
    }
    
    public double promedio(){
    
        return (getEp()+getEf()+getPp())/3;
    
    }

    @Override
    public void mostrarDatos() {
        
        System.out.println(getCod()+" "+getApnom()+""+getSexo()+" "+getEdad()+""
                +getNivel()+""+getEp()+""+getEf()+""+getPp()+promedio());
    }
    
    
    

 
   /* public double promedio() {
       
    }*/
    
    
    
    
}
