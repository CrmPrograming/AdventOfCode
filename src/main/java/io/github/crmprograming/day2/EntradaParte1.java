package io.github.crmprograming.day2;

public class EntradaParte1 {
	
	private int min;
	private int max;
	private char cifrado;
	private String passwd;
	
	public EntradaParte1(int min, int max, char cifrado, String passwd) {
		this.min = min;
		this.max = max;
		this.cifrado = cifrado;
		this.passwd = passwd;
	}
	
	public boolean esValido() {
		int conteo = 0;
		int i = 0;
		char[] caracteres = passwd.toCharArray();
		
		while (i < caracteres.length && conteo <= max) {
			if (caracteres[i] == cifrado)
				conteo++;
			i++;
		}
		
		return (conteo >= min && conteo <= max);
	}
	
	public int getMin() {
		return min;
	}
	
	public void setMin(int min) {
		this.min = min;
	}
	
	public int getMax() {
		return max;
	}
	
	public void setMax(int max) {
		this.max = max;
	}
	
	public char getCifrado() {
		return cifrado;
	}
	
	public void setCifrado(char cifrado) {
		this.cifrado = cifrado;
	}
	
	public String getPasswd() {
		return passwd;
	}
	
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}

}
