/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package ej3;

import java.util.Random;

/**
 *
 * @author pablo
 */
public enum Voz {
    CONTRATENOR("Masculino"),
    TENOR("Masculino")
    ,BARITONO("Masculino"),
    SOPRANO("Femenino"),
    MEZZOSOPRANO("Femenino"),
    CONTRALTO("Femenino");
    
    private String sexo;

    private Voz(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Voz{" + "sexo=" + sexo + '}';
    }
    
     public static Voz getAleatorio(){
        
        Random alea = new Random();
        
        Voz [] modelos = Voz.values();
        
        int posicionValida = alea.nextInt(0, modelos.length);
        
        return modelos[posicionValida];
        
    }
     
     
   
}
