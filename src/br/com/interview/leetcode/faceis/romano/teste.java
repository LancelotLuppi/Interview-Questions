package br.com.interview.leetcode.faceis.romano;

public class teste {
	
	public static void main(String[] args) {
		
		
		String s = "XXX";
		
		int[] map = new int [256];
		map['I'] = 1; map['V'] = 5; map['X'] = 10; map['L'] = 50; map['C'] = 100; map['D'] = 500; map['M'] = 1000;
		
		for (int i = s.length()-1; i >= 0; --i) {
			int cur = map[s.charAt(i)];
			System.out.println(cur);
		}
		
		
	}
}
