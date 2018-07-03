package com.cice.indices;

import java.util.ArrayList;

public class ColeccionesBasadasEnIndice {

    public static void main(String[] args) {
        ArrayList<String> listaNombres = new ArrayList<>(5);
        listaNombres.add("Paco");
        listaNombres.add("Juan");
        listaNombres.add(2,"Ernesto");

        System.out.println("El primer nombre es " + listaNombres.get(0));

        for (String a:listaNombres) {
            System.out.println(a);
        }
        System.out.println("============");

        for(int i = 0; i<listaNombres.size();i++){
            System.out.println(listaNombres.get(i));
        }
    }
}
