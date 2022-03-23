O problema aqui é conseguir criar um conversor de números romanos para números arábicos.

* I pode ser colocado antes do X(10) e V(5) para formar 9 e 4.
* X pode ser colocado antes do C(100) e L(50) para formar 90 e 40.
* C pode ser colocado antes do M(1000) e C(500) para formar 900 e 400.

Exemplos:
  Input: s = "III"
  Output: 3
  Explicação: III = 3.
  
  Input: s = "LVIII"
  Output: 58
  Explicação: L = 50, V = 5, III = 3.
  
  Input s = "MCMXCIV"
  Output: 1994
  Explicação: M = 1000, CM = 900, XC = 90 e IV = 4.
  
  Restrições:
    * 1 <= s.length <= 15;
    * s contém apenas os caracteres {'I', 'V', 'X', 'L', 'C', 'D', 'M'};
    * É garantido que o s é uma romano integral válido no alcance {1 até 3999}
    
    
    Tradução feita do site:
    https://leetcode.com/problems/roman-to-integer/
