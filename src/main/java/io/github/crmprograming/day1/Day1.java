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
	
	private static boolean sonSolucion(int  x, int y, int z) {
		return (x + y + z == 2020);
	}

	public static void main(String[] args) throws IOException {		
		int[] expense_report = leerDatos(Day1.class.getResource("/inputs/day1/puzzle_input.txt").getFile());
		int i = 0;
		int j = i + 1;
		int k = j + 1;
		
		while ((i < TOTAL_DATOS - 2) && !sonSolucion(expense_report[i], expense_report[j], expense_report[k])) {
			while (j < TOTAL_DATOS - 1 && !sonSolucion(expense_report[i], expense_report[j], expense_report[k])) {
				
				while (k < TOTAL_DATOS && !sonSolucion(expense_report[i], expense_report[j], expense_report[k])) {
					k++;
				}
				if (k == TOTAL_DATOS) {
					j++;
					k = j + 1;
				}
			}
			if (j == TOTAL_DATOS - 1) {
				i++;
				j = i + 1;
				k = j + 1;
			}
		}
			
		System.out.printf("Estos tres números suman %d: %d | %d | %d\n", 2020, expense_report[i], expense_report[j], expense_report[k]);
		System.out.println("El resultado de multiplicarlos es: " + (Long.valueOf(expense_report[i]) * Long.valueOf(expense_report[j]) * Long.valueOf(expense_report[k])));
	}

}