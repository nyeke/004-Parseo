package com.cice.ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int menu = 0;

        while (menu <  6) {
            System.out.println("==================");
            System.out.println("1. Nuevo precio");
            System.out.println("2. Precio medio");
            System.out.println("3. Precio máximo");
            System.out.println("4. Precio minimo");
            System.out.println("5. Mostrar todos los precios");
            System.out.println("6. Salir");
            System.out.println("==================");
            menu = sc.nextInt();

            switch (menu){
                case 1:
                    nuevoNumero(numeros);
                    break;
                case 2:
                    media(numeros);
                    break;
                case 3:
                    mayor(numeros);
                    break;
                case 4:
                    menor(numeros);
                    break;
                case 5:
                    mostrar(numeros);
                    break;
                default:
                    System.out.println("Hasta pronto");
            }
        }
    }


    private static ArrayList<Integer> nuevoNumero (ArrayList<Integer> num){
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce numero: ");
        num.add(sc.nextInt());
        return num;
    }

    private static void media (ArrayList<Integer> num){
        int suma = 0;
        for (int a:num) {
            suma += a;
        }
        System.out.println("La media es: " + (suma/ num.size()));
    }

    private static void mayor (ArrayList<Integer> num){
        int mayor = 0;
        for (int a:num) {
            if (a>mayor){
                mayor = a;
            }
        }
        System.out.println("El mayor precio es: " + mayor);
    }

    private static void menor (ArrayList<Integer> num){
        int menor = num.get(0);
        for (int a:num) {
            if (a<menor){
                menor = a;
            }
        }
        System.out.println("El menor precio es: " + menor);
    }

    private static void mostrar (ArrayList<Integer> num){
        for (int a:num) {
            System.out.println(a);
        }
    }
}
