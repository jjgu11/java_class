
package Trabajador;


public class Trabajador {
    
    private String cod,nom;
    private double bon,des,sb;

    
    
    public Trabajador() {
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

    public double getBon() {
        return bon;
    }

    public void setBon(double bon) {
        this.bon = bon;
    }

    public double getDes() {
        return des;
    }

    public void setDes(double des) {
        this.des = des;
    }

    public double getSb() {
        return sb;
    }

    public void setSb(double sb) {
        this.sb = sb;
    }
    
    
    public double sneto(){
    
        return sb+bon-des;
    }
    
    
    
}
