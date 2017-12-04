
package demo0602;


public abstract class Persona {
    
    
    protected String ap,nom;
    protected int edad;

    public Persona(String ap, String nom, int edad) {
        this.ap = ap;
        this.nom = nom;
        this.edad = edad;
    }
    
    public abstract String mostrarDatos();
    
    public String generaCorreo(){
    
        return ""+nom.charAt(0)+ap.charAt(0)+edad+"@utp.edu.pe";
    }
    
    
    
    
}
