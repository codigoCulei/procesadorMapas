package com.proyecto;

import java.util.Scanner;

/**
 * clase de utilidad para leer datos del usuario por stdin con proteccion de ingreso invalido
 * <p>
 * Menu es un envoltorio de scanner con protecciones para entradas invalidas del usuario
 * 
 * 
 *
 * @author uwu

 */

public class Menu {
    private Menu(){	
    }

    public static String getUserInput(Scanner scanner){
	String opcion = scanner.nextLine();

	return opcion;
    }
    public static int getUserInt(Scanner scanner) {
    while (true) { // Loop until we get a valid number
        String line = scanner.nextLine(); // Always read the whole line
        try {
            return Integer.parseInt(line); // Try to convert it
        } catch (NumberFormatException e) {
            System.out.print("Entrada inválida. Por favor ingrese un número: ");
        }
    }}
    public static double getUserDouble(Scanner scanner) {
    while (true) { // Loop until we get a valid number
        String line = scanner.nextLine(); // Always read the whole line
        try {
            return Double.parseDouble(line); // Try to convert it
        } catch (NumberFormatException e) {
            System.out.print("Entrada inválida. Por favor ingrese un número: ");
        }
    }
    }

    

}
