package com.cice;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Introduce un numero:");

        Scanner sc = new Scanner(System.in);
        String primero = sc.nextLine();

        System.out.println("Introduce otro numero:");
        String segundo = sc.nextLine();

        int n1 = Integer.parseInt(primero);
        int n2 = Integer.parseInt(segundo);

        System.out.println("El resutado de la suma es " + (n1+n2));
        System.out.println("Resultado: " + (Integer.parseInt(primero)+Integer.parseInt(segundo)));

    }
}
