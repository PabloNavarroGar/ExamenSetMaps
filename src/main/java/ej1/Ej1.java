/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej1;

import daw.Desfibrilador;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Stream;

/**
 *
 * @author pablo
 */
public class Ej1 {
    //Para pasar como dice el examen una lista ordeanda
    //Un set con el bojeto entre los diamantes y le pasamos el Array en el parametro
   public static Set<Desfibrilador> getSet(Desfibrilador[] array){
       
       Set<Desfibrilador> conjunto = new TreeSet<>(Arrays.asList(array));
       return conjunto;
   }
   
   //Recibe una coleccion de objetos unicos==> Set
   
   public static Map<String, Desfibrilador> getMap(Set<Desfibrilador> set){
       Map<String,Desfibrilador> map = new HashMap<>();
       //El Iterator, si lo pide
       for (Iterator<Desfibrilador> iterator = set.iterator(); iterator.hasNext();) {
           Desfibrilador next = iterator.next();
           
           //map.put(iterator.next().getId(), iterator.next());
           //Esta seruia la correcta
           map.put(next.getId(),next);
       }
        return map;
   }
   
  
   }


      

    

