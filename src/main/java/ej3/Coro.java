/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author pablo
 */
public class Coro {
    
    public static List<Voz> generarVoces(){
        
        List <Voz> voces = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            
           voces.add(Voz.getAleatorio());  
        }
        
        return voces;
        //if(numeroVocesGenerar < MIN_VOCES)
        // throw new IllegalArgumentException("Parametro no valido");
    }
    
    public static int getNumeroCorosMixtos(List<Voz> listaVoces){
        
        
        
        
    }
    
    
    
     
    
}
