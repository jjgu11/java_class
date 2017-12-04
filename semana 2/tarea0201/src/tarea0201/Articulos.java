/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea0201;

/**
 *
 * @author LAB-USR-AQ265-A0705
 */
public class Articulos {
    
    
    private String cod,des,tipo;
    private double pre_uni;
    private int cant,stock;

    public Articulos() {
        
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

    public double getPre_uni() {
        return pre_uni;
    }

    public void setPre_uni(double pre_uni) {
        this.pre_uni = pre_uni;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    /*Calculando el Importe*/
    public double importe()
    {
        return cant*pre_uni;
    }
    
    
    
    
    
    
}
