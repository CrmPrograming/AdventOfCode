package io.github.crmprograming.day2;

public class EntradaParte2 {
	
	private int min;
	private int max;
	private char cifrado;
	private String passwd;
	
	public EntradaParte2(int min, int max, char cifrado, String passwd) {
		this.min = min;
		this.max = max;
		this.cifrado = cifrado;
		this.passwd = passwd;
	}
	
	public boolean esValido() {		
		char[] caracteres = passwd.toCharArray();
				
		return caracteres[min - 1] == cifrado ^ caracteres[max - 1] == cifrado;
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
