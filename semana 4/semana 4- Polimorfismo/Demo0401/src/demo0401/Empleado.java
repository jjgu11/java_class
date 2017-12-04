
package demo0401;


/*Realizar un programa que ingrese  los datos de n empleados de una empresa: código, apellidos y nombres,
categoría (puede ser técnico o profesional), sueldo básico, bonificación, descuento, bonificación especial 
(solo para profesionales) 
y pago por riesgo de vida (solo para tecnicos).Se pide calcular e imprimir el sueldo neto de cada trabajador*/

public abstract class Empleado {
    
    private String cod,ape,nom,cat;
    private Double sb,b,des;

    
    public Empleado() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getApe() {
        return ape;
    }

    public void setApe(String ape) {
        this.ape = ape;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCat() {
        return cat;
    }

    public void setCat(String cat) {
        this.cat = cat;
    }

    public Double getSb() {
        return sb;
    }

    public void setSb(Double sb) {
        this.sb = sb;
    }

    public Double getB() {
        return b;
    }

    public void setB(Double b) {
        this.b = b;
    }

    public Double getDes() {
        return des;
    }

    public void setDes(Double des) {
        this.des = des;
    }
    
    
    /*METODO ABSTRACTO*/
    public abstract Double sn();
    
    
    
    
}
