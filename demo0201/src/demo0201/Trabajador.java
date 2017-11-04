
package demo0201;


public class Trabajador {
    
    private String cod,nom;
    private double sb,bn,des;

    
    public Trabajador(String cod, String nom, double sb, double bn, double des) {
        this.cod = cod;
        this.nom = nom;
        this.sb = sb;
        this.bn = bn;
        this.des = des;
    }
    
    public double sneto(){
        
        return sb+bn-des;
    }
    
    
}
