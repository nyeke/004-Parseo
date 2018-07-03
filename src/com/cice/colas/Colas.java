package com.cice.colas;

import java.util.PriorityQueue;

public class Colas {

    public static void main(String[] args) {
        PriorityQueue<String> cola = new PriorityQueue<>();

        cola.add("caso");
        cola.add("boche");
        cola.add("perro");
        cola.add("alfombra");

        for (String s : cola){
            System.out.println(s);
        }

        PriorityQueue<Integer> enteros = new PriorityQueue<>();

        enteros.add(1);
        enteros.add(2);
        enteros.add(3);
        enteros.add(6);
        enteros.add(7);
        enteros.add(4);

        for (Integer entero:enteros){
            System.out.println(entero);
        }

        System.out.println("*******ORDENA*********");

        while (!enteros.isEmpty()){
            System.out.println(enteros.poll());
        }



    }

}
