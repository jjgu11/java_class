/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo01;

import javax.swing.JOptionPane;

/**
 *
 * @author LAB-USR-AQ265-A0705
 * 
 * Diseñar un programa que ingrese los datos de los trabajadores:
 * codigo, apellidos y nombres, sueldo basico, bonificacion y descuento.
 * se pide calcular e imprimir el sueldo neto de cada trabajador
 * aplique clases ojetos y metodos.
 * 
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n,i;
        
        n= Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos trabajadores hay"));
        
        for(i=0; i<=n; i++){
            
        }
        
        Trabajador tra = new Trabajador();
        
        tra.setCod(JOptionPane.showInputDialog("Ingrese el codigo"));
        tra.setNom(JOptionPane.showInputDialog("Ingrese el Nombre"));
        tra.setSb(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Sueldo Basico")));
        tra.setBon(Double.parseDouble(JOptionPane.showInputDialog("Ingrese la Bonificacion")));
        tra.setDes(Double.parseDouble(JOptionPane.showInputDialog("Ingrese el Descuento")));
        
        System.out.println("El sueldo neto es" + tra.sneto());
    }
    
}
