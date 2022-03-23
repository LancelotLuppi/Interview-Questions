package br.com.interview.leetcode.faceis.romano;

public class solucaoDois {

	
	public int romanToInt(String s) {
		
        int[] map = new int[256];
        map['I'] = 1; map['V'] = 5; map['X'] = 10; map['L'] = 50; map['C'] = 100; map['D'] = 500; map['M'] = 1000;
        
        
        /* 	O laço faz a leitura da direita pra esquerda,
         * 	o valorString recebe o valor associado com
         * 	a letra recebida.
         * 
         * 	O valorString entra no if para verificar se deve somar
         * 	ou substrair ou adicionar ao valorFinal
         * 
         * 	Antes do laço terminar, a variável verificador irá 
         * 	receber o valorString que foi usado, caso
         * 	o novo valorString for menor que o verificador,
         * 	ele será subtraído do valorFinal. 
         */
        int valorFinal = 0, verificador = 1;
        for (int i = s.length()-1; i >= 0; --i) {
            int valorString = map[s.charAt(i)];
            if (valorString < verificador) valorFinal -= valorString;
            else {
                verificador = valorString;
                valorFinal += valorString;
            }
        }
        return valorFinal;
    }
}
