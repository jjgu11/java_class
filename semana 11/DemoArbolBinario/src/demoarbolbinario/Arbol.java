
package demoarbolbinario;

public class Arbol {
    
       static int sw=0;
    Nodo raiz=null;
    
    
    public boolean tieneraiz()
    {
        if(raiz==null) return false;
        else return true;
    }
    
    
    public Arbol alta(int dat)
    {
        if(!tieneraiz())
        {
            Nodo nuevo=new Nodo(dat);
            raiz=nuevo;
            System.out.println("raiz="+raiz.dato);
        }
        else
        {
            boolean izq;
            Nodo actual=raiz;
            while(true)
            {
                if(actual.dato<dat) izq=false;
                else izq=true;
                if(!izq)
                {
                    if(actual.der==null)
                    {
                        Nodo nuevo=new Nodo(dat);
                        actual.der=nuevo;
                        System.out.println("der ="+nuevo.dato);
                        break;
                    }
                    else actual=actual.der;
                }
                else
                {
                    if(actual.izq==null)
                    {
                        Nodo nuevo=new Nodo(dat);
                        actual.izq=nuevo;
                        System.out.println("izq ="+nuevo.dato);
                        break;
                    }
                    else actual=actual.izq;
                 }
            }
        }return this;
    }
    
    
    public void imprimirpreorden()
    {
        ayudantePreorden(raiz);
        System.out.println();
    }
    
    
    public void ayudantePreorden(Nodo dat)
    {
        if(dat==null)
                return;
        System.out.printf("%d-->",dat.dato);
        ayudantePreorden(dat.izq);
        ayudantePreorden(dat.der);
    }
    
    
    public void imprimirinorden()
    {
        ayudanteInorden(raiz);
        System.out.println();
    }
    
    
    public void ayudanteInorden(Nodo dat)
    {
        if(dat==null)
                return;
        ayudanteInorden(dat.izq);
        System.out.printf("%d-->",dat.dato);
        ayudanteInorden(dat.der);
    }
    
    
    public void imprimirpostorden()
    {
        ayudantePostorden(raiz);
        System.out.println();
    }
    
    
    public void ayudantePostorden(Nodo dat)
    {
        if(dat==null)
                return;
        ayudantePostorden(dat.izq);
        ayudantePostorden(dat.der);
        System.out.printf("%d-->",dat.dato);
    }
    
    
  public int busca(int num)
  {
      return buscador(raiz,num);
  }
  
  
  public int buscador(Nodo dat,int num)
  {
      if(dat!=null)
      {
          if(dat.dato==num)
          {
              sw=1;
              return sw;
          }
          buscador(dat.izq,num);
          buscador(dat.der,num);
     }
     return sw;
  }
    
    
}
