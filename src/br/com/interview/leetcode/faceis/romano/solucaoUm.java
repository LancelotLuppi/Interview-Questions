package br.com.interview.leetcode.faceis.romano;

public class solucaoUm {

	
	public static void main(String[] args) {
		
		String numeroRomano = "DCXXI"; //Saída: 611 | Esperado: 621
		System.out.println(romanoParaINT(numeroRomano));
		
	}

	

	public static int romanoParaINT(String s) {
		
		int contador = 0;
		
		s = s.replace("CM", "900,").replace("M", "1000,")
				.replace("CD", "400,").replace("D", "500,")
				.replace("XC", "90,").replace("C", "100,")
				.replace("XL", "40,").replace("L", "50,")
				.replace("IX", "9,").replace("X", "10,")
				.replace("IV", "4,").replace("V", "5,")
				.replace("I", "1,");
		
		String[] sa = s.split(",");
		for (String string : sa) {
			contador += Integer.parseInt(string);
		}
		
		return contador;
	}
	
}
