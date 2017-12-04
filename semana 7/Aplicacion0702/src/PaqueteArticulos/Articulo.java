/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaqueteArticulos;

/**
 *
 * @author c00075
 */
public class Articulo {
    private String cod,des,tipo;
    private double preu;
    private int cant;

    public Articulo() {
    }

    public Articulo(String cod, String des, String tipo, double preu, int cant) {
        this.cod = cod;
        this.des = des;
        this.tipo = tipo;
        this.preu = preu;
        this.cant = cant;
    }
    

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPreu() {
        return preu;
    }

    public void setPreu(double preu) {
        this.preu = preu;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }
    
}
