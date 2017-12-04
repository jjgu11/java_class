/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion0902;

public class Alumno {
    private String cod, apnom;
    private double ep,ef,pp;

    public Alumno() {
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getApnom() {
        return apnom;
    }

    public void setApnom(String apnom) {
        this.apnom = apnom;
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
    public double promedio()
    {
       return (ep+ef+pp)/3;
    }        
}
