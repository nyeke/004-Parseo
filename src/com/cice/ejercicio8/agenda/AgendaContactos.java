package com.cice.ejercicio8.agenda;

import java.util.HashMap;
import java.util.Scanner;

public class AgendaContactos {

    HashMap<Long, String> agenda = new HashMap<>();
    Scanner sc = new Scanner(System.in);
    private int opcion;

    public void iniciarApp() {
        do {
            showMenu();
            comprobarOpcion(opcion);
        } while (opcion != 4);

    }

    public void showMenu (){
        System.out.println("==================");
        System.out.println("1. Nuevo contacto");
        System.out.println("2. Eliminar contacto");
        System.out.println("3. Mostrar contactos");
        System.out.println("4. Salir");
        System.out.println("==================");
        opcion = sc.nextInt();
    }

    private void comprobarOpcion(int opcion){
        switch (opcion) {
            case 1:
                nuevoContacto();
                break;
            case 2:
                eliminarContacto();
                break;
            case 3:
                mostrarContacto();
                break;
            case 4:
                System.out.println("Hasta pronto");
                break;
            default:
                System.out.println("Opcion no valida");
        }
    }

    private void nuevoContacto(){
        System.out.print("Introduce su DNI: ");
        long dni = sc.nextLong();
        sc.nextLine();
        System.out.print("Introduce su Nombre: ");
        String nombre = sc.nextLine();

        agenda.put(dni, nombre);
    }

    private void eliminarContacto(){
        System.out.print("Introduce su DNI: ");
        long dni = sc.nextLong();

        if (agenda.containsKey(dni)){
            agenda.remove(dni);
        } else {
            System.out.println(" No existe el contacto");
        }

    }

    private void mostrarContacto(){
        agenda.forEach((a,b) -> System.out.println(a + "-" + b));
    }

}
