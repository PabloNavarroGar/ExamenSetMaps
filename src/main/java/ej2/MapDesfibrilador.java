/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ej2;

import daw.Desfibrilador;
import ej1.Ej1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author pablo
 */
public class MapDesfibrilador {

    //Atributos
    final private Map<String, Desfibrilador> map;

    public MapDesfibrilador(Desfibrilador[] array, boolean orden) {
        // var= es una variable, como acordar el camino
        //abajo se puede poner declarando u  map
        var hashmap = Ej1.getMap(Ej1.getSet(array));
        //Map<String,Desfibrilador> hashmap = Ej1.getMap(Ej1.getSet(array));
        //Declara un ternario para hacer la parte dle ejercicio
        map = orden ? new TreeMap<>(hashmap) : hashmap;
        //Creo un tree map si tiene orden, si no hashmap normal
        //Manera novata
//        if(orden){
//            //creo el treemap y lo relleno
//            
//        }else{
//            
//            //Creo el hashmap
//        }

    }

    @Override
    public String toString() {
        String tmp = "";

        for (String key : map.keySet()) {

        }

        return tmp;
    }

    //2C
    public boolean presente(Desfibrilador d) {
        return map.containsKey(d.getId());
    }

    public List<Desfibrilador> obtenerListaObjetos() {

        return new ArrayList<>(map.values());
    }

    public Map<String, Integer> numeroDesfibyEmail() {

        var nuevoMap = new HashMap<String, Integer>();

        for (Desfibrilador des : map.values()) {
            if (nuevoMap.containsKey(des.getEmail())) {

                nuevoMap.put(des.getEmail(), nuevoMap.get(des.getEmail()) + 1);
            } else {
                nuevoMap.put(des.getEmail(), 1);
            }

        }
            return nuevoMap;
    }
    

}
