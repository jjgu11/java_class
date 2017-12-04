/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajador02;

/**
 *
 * @author LAB-USR-AQ265-A0406
 */
public class Trabajador {
    
    
    private String cod,nom;
    private double bon,des,sb;

    public Trabajador(String cod, String nom, double bon, double des, double sb) {
        this.cod = cod;
        this.nom = nom;
        this.bon = bon;
        this.des = des;
        this.sb = sb;
    }
    
    public double sneto(){
       
       return sb+bon-des;
       
    }
    
    
    
    
    
    
}
