
package demot;

public abstract class Persona {
    
    protected String nom,sex;
    protected int edad;

    public Persona(String nom, String sex, int edad) {
        this.nom = nom;
        this.sex = sex;
        this.edad = edad;
    }
    
    
    public abstract String Datos();
    
    public String Codigo(){  
        return (int)Math.random()*500+50+""+nom.charAt(0);
    }

    
    @Override
    public String toString() {
        return "Persona{" + "Nombre: " + nom + ", Sexo: " + sex + ", Edad: " + edad + '}';
    }
    
    
    
}
