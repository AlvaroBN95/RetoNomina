/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nomina;

/**
 *
 * @author jmanuel
 */
public class Trabajador {
    
    private String nom;
    private String nif;
    private String grupProf;
    private char grupCot;
    private String nafSS;
    private String fecAnt;
    
    public Trabajador(){
        nom="Rosa María de los Cármenes";
        nif="67458779C";
        grupProf="Subalternos";
        grupCot='A';
        nafSS="3546576878";
        fecAnt="12/01/2005";
    }
    
    public Trabajador(String nom, String nif, String grupProf, char grupCot, String nafSS, String fecAnt){
        this.nom=nom;
        this.nif=nif;
        this.grupProf=grupProf;
        this.grupCot=grupCot;
        this.nafSS=nafSS;
        this.fecAnt=fecAnt;
    }
    
    public String getNom(){
        return nom;
    }
    public String getNif(){
        return nif;
    }
    public String getGrupProf(){
        return grupProf;
    }
    public char getGrupCot(){
        return grupCot;
    }
    public String getNafSS(){
        return nafSS;
    }
    public String getFecAnt(){
        return fecAnt;
    }
    
    public void setNom(String nom){
        this.nom=nom;
    }
    public void setNif(String nif){
        this.nif=nif;
    }
    public void setGrupProf(String grupProf){
        this.grupProf=grupProf;
    }
    public void setGrupCot(char grupCot){
        this.grupCot=grupCot;
    }
    public void setNafSS(String nafSS){
        this.nafSS=nafSS;
    }
    public void setFecAnt(String fecAnt){
        this.fecAnt=fecAnt;
    }
    
    
}
