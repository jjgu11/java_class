
package repasoef;


public abstract class Socios {

    private String apnom,tipo,cod,sexo,ec;
    private Double cuotam,mora;

    public Socios(String apnom, String tipo, String cod, String sexo, String ec, Double cuotam, Double mora) {
        this.apnom = apnom;
        this.tipo = tipo;
        this.cod = cod;
        this.sexo = sexo;
        this.ec = ec;
        this.cuotam = cuotam;
        this.mora = mora;
    }

  
    
    
   
    // metodos Get and Setter
    public String getApnom() {
        return apnom;
    }

    public void setApnom(String apnom) {
        this.apnom = apnom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEc() {
        return ec;
    }

    public void setEc(String ec) {
        this.ec = ec;
    }

    public Double getCuotam() {
        return cuotam;
    }

    public void setCuotam(Double cuotam) {
        this.cuotam = cuotam;
    }

    public Double getMora() {
        return mora;
    }

    public void setMora(Double mora) {
        this.mora = mora;
    }
     
     //metodos
     abstract  double importe();
     abstract double  mora();

     
     
    @Override
    public String toString() {
        return "Socios{" + "apnom=" + apnom + ", tipo=" + tipo + ", cod=" + cod + ", sexo=" + sexo + ", ec=" + ec + ", cuotam=" + cuotam + ", mora=" + mora + '}';
    }
     
     
    
     
    
    
    
    
}
