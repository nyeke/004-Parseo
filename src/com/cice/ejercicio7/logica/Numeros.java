package com.cice.ejercicio7.logica;

import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {

    private ArrayList<Integer> numeros = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);
    private int aux = 0;

    /**
     * Inicia el menu y recupera la opcion
     */
    public void iniciarApp() {

        int menu = 0;

        do {
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
                    nuevoNumero();
                    break;
                case 2:
                    media();
                    break;
                case 3:
                    mayor();
                    break;
                case 4:
                    menor();
                    break;
                case 5:
                    mostrar();
                    break;
                case 6:
                    System.out.println("Hasta pronto");
                default:
                    System.out.println("Opcion no valida");
            }
        } while (menu !=  6);
    }

    /**
     * Introduce un nuevo numero
     */
    private void nuevoNumero (){
        System.out.print("Introduce numero: ");
        numeros.add(sc.nextInt());
    }

    /**
     * Recupera la media de los numeros
     */
    private void media (){
        aux = 0;
        for (int a:numeros) {
            aux += a;
        }
        System.out.println("La media es: " + (aux/ numeros.size()));
    }

    /**
     * Recupera el mayor
     */

    private void mayor (){
        aux = 0;
        for (int a:numeros) {
            if (a>aux){
                aux = a;
            }
        }
        System.out.println("El mayor precio es: " + aux);
    }

    /**
     * Recupera el menor
     */
    private void menor (){
        aux = numeros.get(0);
        for (int a:numeros) {
            if (a<aux){
                aux = a;
            }
        }
        System.out.println("El menor precio es: " + aux);
    }

    /**
     * Muestra todos los numeros
     */
    private void mostrar (){
        for (int a:numeros) {
            System.out.println(a);
        }
    }}
