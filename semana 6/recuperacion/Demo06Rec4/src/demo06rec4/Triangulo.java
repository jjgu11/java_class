
package demo06rec4;

 class Triangulo extends Figura{
     
    private String tipo;

    public Triangulo(double a,double h,String tipo) {
        
        super(a,h); 
        
        this.tipo = tipo;
    }

    double area(){
        
        return getAncho()*getAlto()/2;
    }
    
    void mostrarTipo(){
        
        System.out.println("Triangulo es tipo "+ tipo);
    }
     
     
    
}
