package ejercicio7;

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
            int num = 0;

            switch (menu){
                case 1:
                    System.out.print("Introduce numero: ");
                    numeros.add(sc.nextInt());
                    break;
                case 2:
                    for (int a:numeros) {
                        num += a;
                    }
                    System.out.println("La media es: " + (num/ numeros.size()));
                    break;
                case 3:
                    for (int a:numeros) {
                        if (a>num){
                            num = a;
                        }
                    }
                    System.out.println("El mayor precio es: " + num);
                    break;
                case 4:
                    num = numeros.get(0);
                    for (int a:numeros) {
                        if (a<num){
                            num = a;
                        }
                    }
                    System.out.println("El menor precio es: " + num);
                    break;
                case 5:
                    for (int a:numeros) {
                        System.out.println(a);
                    }
                    break;
                default:
                    System.out.println("Hasta pronto");
            }
        }

    }






}
