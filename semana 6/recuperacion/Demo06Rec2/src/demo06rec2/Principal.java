/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo06rec2;

/**
 *
 * @author LAB-USR-AQ265-A0706
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
        Triangulo t1 = new Triangulo("",4.0,4.0);
        Triangulo t2 = new Triangulo("",4.0,4.0);
        
        System.out.println("Infomacion para T1");
        t1.mostrarTipo();
        t1.mostrarDimension();
        System.out.println("El area es "+ t1.area());
        
        System.out.println("Infomacion para T2");
        t2.mostrarTipo();
        t2.mostrarDimension();
        System.out.println("El area es "+ t2.area());
                
    }
    
}
