/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3;

import java.util.List;

/**
 *
 * @author pablo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coro.generarVoces();
        
        List<Voz> coro1 = Coro.generarVoces();
        List<Voz> coro2 = Coro.generarVoces();
       
        
        System.out.println("Coro 1");
        coro1.forEach(System.out::println);
        
        System.out.println("Coro 2");
        coro2.forEach(System.out::println);
        
        
       
    }
    
}
