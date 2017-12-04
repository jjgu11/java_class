
package demo06;


public class Alumno {
    
    
    String cod,apnom,sex,carr;
    int ae;
    double ep,ef,pp,nte,ng,nlab;

    public Alumno(String cod, String apnom, String sex, String carr, int ae, double ep, double ef, double pp) {
        this.cod = cod;
        this.apnom = apnom;
        this.sex = sex;
        this.carr = carr;
        this.ae = ae;
        this.ep = ep;
        this.ef = ef;
        this.pp = pp;
    }

    
    
    public Alumno(String cod, String apnom, String sex, String carr, int ae, double ep, double ef, double pp, double nlab) {
        this.cod = cod;
        this.apnom = apnom;
        this.sex = sex;
        this.carr = carr;
        this.ae = ae;
        this.ep = ep;
        this.ef = ef;
        this.pp = pp;
        this.nlab = nlab;
    }

    
    
    public Alumno(String cod, String apnom, String sex, String carr, int ae, double ep, double ef, double pp, double nte, double ng) {
        this.cod = cod;
        this.apnom = apnom;
        this.sex = sex;
        this.carr = carr;
        this.ae = ae;
        this.ep = ep;
        this.ef = ef;
        this.pp = pp;
        this.nte = nte;
        this.ng = ng;
    }
    
    public double promedio(double ep,double ef, double pp){
    
            return (ep+ef+pp)/3;
    
    }
    
    public double promedio(double ep,double ef, double pp, double nlab){
    
            return (ep+ef+pp+nlab)/4;
    
    }
    
    
    public double promedio(double ep,double ef, double pp, double ntc, double ng){
    
            return (ep+ef+pp+ntc+ng)/4;
    
    }
    

    
}
