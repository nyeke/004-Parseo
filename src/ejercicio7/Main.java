package ejercicio7;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numeros = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        int i = 0;
        double suma = 0;
        String salir= "";

        while (i<5) {
            System.out.print("Introduce numero: ");
            numeros.add(sc.nextInt());
            i++;
        }

        for (int a:numeros) {
            suma += a;
        }

        System.out.println("La media es: " + (suma/ numeros.size()));
    }






}
