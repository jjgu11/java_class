
package demo0301;


/*CLASE PADRE CON ATRIBUTOS COMUNES PAERA LAS CLASES HIJAS*/

public class Alumno {
    
    
    private String cod,nom;
    private double ep,ef,pp;

    
    public Alumno() {
    
    }

    
    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public double getEp() {
        return ep;
    }

    public void setEp(double ep) {
        this.ep = ep;
    }

    public double getEf() {
        return ef;
    }

    public void setEf(double ef) {
        this.ef = ef;
    }

    public double getPp() {
        return pp;
    }

    public void setPp(double pp) {
        this.pp = pp;
    }
    
    
    
    
    
    
}
