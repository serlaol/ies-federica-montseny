package Tarea_Vehiculo;

import java.util.Scanner;

public class mainVehiculos {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Vehiculo[] vehiculos = ListaVehiculos();
       for (int i = 0; i < vehiculos.length; i++){
           Vehiculo vehiculo = vehiculos[i];
           System.out.println("Las matriculas son " + vehiculo.getMatricula());
       }

    }

    static Vehiculo[] ListaVehiculos(){
        System.out.println("Introduce el tamaño de la lista");
        Vehiculo[] listaVehiculos = new Vehiculo[scanner.nextInt()];
        for(int i = 0; i < listaVehiculos.length; i++){
            listaVehiculos[i] = datosVehiculo();
        }

        return listaVehiculos;
    }

    static Vehiculo datosVehiculo() {
        System.out.println("Introduce un tipo de vehiculo");
        String tipo = scanner.next();
        System.out.println("Introduce una velocidad");
        double velocidad = scanner.nextDouble();
        System.out.println("Intrduce un color");
        String color = scanner.next();
        System.out.println("Introduce una matricula");
        String matricula = scanner.next();

        Vehiculo ve = new Vehiculo(tipo, velocidad, color, matricula);
        return ve;
    }
}
