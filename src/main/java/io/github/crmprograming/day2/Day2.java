package io.github.crmprograming.day2;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Day2 {
	
	private static Object[] leerDatos(String ruta) throws IOException {
		Scanner in =  new Scanner(new File(ruta));
		ArrayList<EntradaParte2> entradas = new ArrayList<>();
		Integer result = 0;
		
		while (in.hasNextLine()) {
			EntradaParte2 actual = parsearLinea(in.nextLine()); 
			entradas.add(actual);
			
			result += (actual.esValido())?1:0;
		}
		
		in.close();
		
		return new Object[] {result, entradas};
	}

	private static EntradaParte2 parsearLinea(String line) {
		String[] segmentos = line.split(":"); // 1-2 x
		String aux = segmentos[0].split(" ")[0]; // 1-2
		char letra = segmentos[0].split(" ")[1].charAt(0); // x
		
		
		return new EntradaParte2(Integer.valueOf(aux.split("-")[0]), Integer.valueOf(aux.split("-")[1]), letra, segmentos[1].substring(1));
	}

	public static void main(String[] args) throws IOException {		
		Object[] resultados = leerDatos(Day2.class.getResource("/inputs/day2/puzzle_input.txt").getFile());
		
		System.out.println("El total de contraseñas válidas es de: " + (Integer) resultados[0]);
	}

}