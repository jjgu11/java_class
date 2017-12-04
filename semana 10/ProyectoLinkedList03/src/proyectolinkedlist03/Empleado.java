package proyectolinkedlist03;
public class Empleado 
{
  String cod,apnom;
  double sb,bon,des;
  public Empleado(String cod, String apnom, double sb, double bon, double des) {
        this.cod = cod;
        this.apnom = apnom;
        this.sb = sb;
        this.bon = bon;
        this.des = des;
    }
  double neto(double a,double b,double c)
  {
      return a+b-c;
  }
  @Override
  public String toString() {
        return "Empleado{" + "cod=" + cod + ", apnom=" + apnom + ""
                + ", sb=" + sb + ", bon=" + bon + ", des=" + des + ""
                + ", neto="+neto(sb,bon,des)+"\n"+'}';
    }
 }
