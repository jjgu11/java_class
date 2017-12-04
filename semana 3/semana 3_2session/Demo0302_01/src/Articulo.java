/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author LAB-USR-AQ265-A0406
 */
public class Articulo {
    
    private String cod,des,tipo_art;
    private double pre_uni;
    private int cant,stock;

    public Articulo() {
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

    public String getTipo_art() {
        return tipo_art;
    }

    public void setTipo_art(String tipo_art) {
        this.tipo_art = tipo_art;
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
    
    /*
    public double importe(){
    
        return pre_uni*cant;
    }*/
    
    
    
    
    
    
    
    
    
    
    
    
}
