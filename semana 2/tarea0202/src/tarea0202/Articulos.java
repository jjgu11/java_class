/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea0202;

/**
 *
 * @author LAB-USR-PT385-1408
 */
public class Articulos {
    
    private String cod,des,tipo;
    private double pre_uni;
    private int cant,stock;

    public Articulos(String cod, String des, String tipo, double pre_uni, int cant, int stock) {
        this.cod = cod;
        this.des = des;
        this.tipo = tipo;
        this.pre_uni = pre_uni;
        this.cant = cant;
        this.stock = stock;
    }
    
    
        /*Calculando el Importe*/
    public double importe()
    {
        return cant*pre_uni;
    }
    
    
    
    
    
}
