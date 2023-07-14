package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declarando datos de entrada
        String ubicacionUsuario;
        String destinoUsuario;
        String nombreUsuario;
        String telefonoUsuario;

        //Declarar un dato especial para capturar informacion desde teclado
        Scanner teclado=new Scanner(System.in);

        //Para inicializar las variables

        System.out.println("\u001B[34m Pa'OndeVas  \u001B[0m");
        System.out.print("Digite su ubicacion: " );
        ubicacionUsuario = teclado.nextLine();
        System.out.print("Digite su Destino: ");
        destinoUsuario = teclado.nextLine();
        System.out.print("Digite su Nombre de Usuario: ");
        nombreUsuario = teclado.nextLine();
        System.out.print("Digite su Telefono: ");
        telefonoUsuario = teclado.nextLine();

        //Proceso de problema
        String distancia = "20";

        //Debo hacer parseo de la variable distancia
        //Parseo= cambiar o modrificar el tipo de dato de una variable

        Integer distanciaEnEntero = Integer.parseInt(distancia);

        Integer costoPorKilometro = 6800;
        Integer cobroTotal = (distanciaEnEntero*costoPorKilometro);

        //Salida del problema

        System.out.println("Senor " + nombreUsuario + " su numero de telefono es " + telefonoUsuario + ", usted esta ubicado en la direccion: " + ubicacionUsuario + " y se dirige hacia " + destinoUsuario + ", el costo total de su carrera es de: " + cobroTotal);
    }
}