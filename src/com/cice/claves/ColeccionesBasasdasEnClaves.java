package com.cice.claves;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Set;

public class ColeccionesBasasdasEnClaves {

    public static void main(String[] args) {

        Hashtable<String, String> listaPersonas = new Hashtable<>();

        HashMap<String, String> listaNombres = new HashMap<>();

        // HASHTABLE

        listaPersonas.put("Profesor","Gustavo");
        listaPersonas.put("Alumno","Jose Mari");
        listaPersonas.put("Alumna","Ana");

        System.out.println(listaPersonas.get("Alumno"));
        System.out.println(listaPersonas.size());

        if(listaPersonas.contains("Gustavo")){
            System.out.println("Existe");
        }

        Set<String> keySet = listaPersonas.keySet();

        for(String key : keySet){
            System.out.println(key);
            System.out.println(listaPersonas.get(key));
        }

        System.out.println("**********************");

        // HASHMAP

        listaNombres.put("Profesor","Gustavo");
        listaNombres.put("Alumno","Ernesto");
        listaNombres.put("Alumna","Rocio");
        listaNombres.put(null, null);

        System.out.println(listaNombres.get("Alumna"));
        System.out.println(listaNombres.size());

        if(listaNombres.containsKey("Alumno")){
            System.out.println("Existe Key");
        }

        Set<String> keySet1 = listaNombres.keySet();

        for(String key : keySet1){
            System.out.println(key);
            System.out.println(listaPersonas.get(key));
        }

    }

}
