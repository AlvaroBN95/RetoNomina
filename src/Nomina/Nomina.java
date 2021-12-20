/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomina;

/**
 *
 * @author jmanuel
 */
public class Nomina {
    
    private double irpf;
    private double contcom;
    private double fp;
    private double paro;
    private double totalaport;
    private double totalbruto;
    private double totalneto;
    private double adeducir;
    private double FOGASA;
    private double baseSS;
    private double baseirpf;
    private double fpAport;
    private double paroAport;
    private double atepAport;
    
    public double devengos(char grupCot, double diaLiq){
        if(grupCot=='A'){
            totalbruto=((30000d/12d)/30d)*diaLiq;
        }
        else{
            totalbruto=((28000d/12d)/30d)*diaLiq;
        }
        return totalbruto;
    }
    
    public double deducciones(){
        double icc=4.7;
        double ifp=0.1;
        double iparo=1.6;
        double iirpf=2.0;
        
        contcom=totalbruto*icc/100;
        paro=totalbruto*iparo/100;
        fp=totalbruto*ifp/100;
        irpf=totalbruto*iirpf/100;
        
        adeducir=contcom+paro+fp+irpf;
        
        return adeducir;
    }
    
    public double getNeto(){
        totalneto=totalbruto-adeducir;
        return totalneto;
    }
    
    public double aportEmp(){
        double ibaseSS=23.6;
        double iatep=1.5;
        double iparo=6.7;
        double ifp=0.6;
        double iFOGASA=0.2;
        
        baseSS=totalbruto*ibaseSS/100;
        atepAport=totalbruto*iatep/100;
        paroAport=totalbruto*iparo/100;
        fpAport=totalbruto*ifp/100;
        FOGASA=totalbruto*iFOGASA/100;
        
        baseirpf=totalbruto;
        
        return totalaport;
    }
    
    public double getIrpf(){
        return irpf;
    }
    
    public void setIrpf(double irpf){
        this.irpf=irpf;
    }
    
    public double getContcom(){
        return contcom;
    }
    
    public void setContcom(double contcom){
        this.contcom=contcom;
    }
    
    public double getFp(){
        return fp;
    }
    
    public void setFp(double fp){
        this.fp=fp;             
    }
    
    public double getParo(){
        return paro;
    }
    
    public void setParo(double paro){
        this.paro=paro;
    }
    
    public double getTotalaport(){
        return totalaport;
    }
    
    public void setTotalaport(double totalaport){
        this.totalaport=totalaport;
    }
    
    public double getTotalbruto(){
        return totalbruto;
    }
           
    
    public void setTotalbruto(double totalbruto){
        this.totalbruto=totalbruto;
    }
    
    public double getTotalneto(){
        return totalneto;
    }
    
    public void setTotalneto(double totalneto){
        this.totalneto=totalneto;        
    }
    
    public double getAdeducir(){
        return adeducir;
    }
    
    public void setAdeducir(double adeducir){
        this.adeducir=adeducir;
    }
}
