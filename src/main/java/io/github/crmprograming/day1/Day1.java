package io.github.crmprograming.day1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Day1 {
	
	private static final int TOTAL_DATOS = 200;
	
	private static int[] leerDatos(String ruta) throws IOException {
		Scanner in =  new Scanner(new File(ruta));
		int[] datos = new int[TOTAL_DATOS];
		int i = 0;
		
		while (in.hasNextLine()) {
			datos[i++] = Integer.valueOf(in.nextLine());
		}
		
		in.close();
		
		return datos;
	}
	
	private static boolean sonSolucion(int x, int y) {
		return (x + y == 2020);
	}

	public static void main(String[] args) throws IOException {		
		int[] expense_report = leerDatos(Day1.class.getResource("/inputs/day1/puzzle_input.txt").getFile());
		int i = 0;
		int j = i + 1;
		
		while ((i < TOTAL_DATOS - 1) && !sonSolucion(expense_report[i], expense_report[j])) {
			while (j < TOTAL_DATOS && !sonSolucion(expense_report[i], expense_report[j])) {
				j++;
			}
			if (j == TOTAL_DATOS) {
				i++;
				j = i + 1;
			}
		}
			
		System.out.printf("Estos dos números suman %d: %d | %d\n", 2020, expense_report[i], expense_report[j]);
		System.out.println("El resultado de multiplicarlos es: " + (expense_report[i] * expense_report[j]));
	}

}