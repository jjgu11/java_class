
package demo06_tarea;


public class Empleado {
    
    
    String cod,apnom,sex,est_civil,cat;
    double sb, bon, des, rep_qc, bon_esp, bon_rsg;
    
    
    /*constructor general*/
    public Empleado(String cod, String apnom, String sex, String est_civil, String cat, double sb, double bon, double des) {
        this.cod = cod;
        this.apnom = apnom;
        this.sex = sex;
        this.est_civil = est_civil;
        this.cat = cat;
        this.sb = sb;
        this.bon = bon;
        this.des = des;
    }

    /*constructor para Profesional (repeticion de quinta categoria)*/
    public Empleado(String cod, String apnom, String sex, String est_civil, String cat, double sb, double bon, double des, double rep_qc) {
        this.cod = cod;
        this.apnom = apnom;
        this.sex = sex;
        this.est_civil = est_civil;
        this.cat = cat;
        this.sb = sb;
        this.bon = bon;
        this.des = des;
        this.rep_qc = rep_qc;
    }

    
    /*constructor para Tecnicos (bonificacion especial, bonificacion por riesgo de vida)*/
    public Empleado(String cod, String apnom, String sex, String est_civil, String cat, double sb, double bon, double des, double bon_esp, double bon_rsg) {
        this.cod = cod;
        this.apnom = apnom;
        this.sex = sex;
        this.est_civil = est_civil;
        this.cat = cat;
        this.sb = sb;
        this.bon = bon;
        this.des = des;
        this.bon_esp = bon_esp;
        this.bon_rsg = bon_rsg;
    }
    
    
    public double sn(double sb,double bon, double des){
    
            return (sb+bon-des);    
    }
    
    
    public double sn(double sb,double bon, double des, double rep_qc ){
    
            return (sb+bon-des)-rep_qc;    
    }
        
    
    public double sn(double sb,double bon, double des,double bon_esp, double bon_rsg){
    
            return (sb+bon-des+bon_esp+bon_rsg);    
    }    
    
    
    
    
    
    
    
    
    
    
    
}
