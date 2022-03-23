O problema aqui é conseguir criar um conversor de números romanos para números arábicos.

</br>

* I pode ser colocado antes do X(10) e V(5) para formar 9 e 4.
* X pode ser colocado antes do C(100) e L(50) para formar 90 e 40.
* C pode ser colocado antes do M(1000) e C(500) para formar 900 e 400.

</br>

Exemplos: </br>
  Input: s = "III" </br>
  Output: 3 </br>
  Explicação: III = 3. </br>
  
  </br>
  
  Input: s = "LVIII" </br>
  Output: 58 </br>
  Explicação: L = 50, V = 5, III = 3. </br>
  
  </br>
  
  Input s = "MCMXCIV" </br>
  Output: 1994 </br>
  Explicação: M = 1000, CM = 900, XC = 90 e IV = 4. </br>
  
  </br>
  
  Restrições: </br>
    * 1 <= s.length <= 15; </br>
    * s contém apenas os caracteres {'I', 'V', 'X', 'L', 'C', 'D', 'M'}; </br>
    * É garantido que o s é uma romano integral válido no alcance {1 até 3999} </br>
   
   Tradução feita do site: </br>
   https://leetcode.com/problems/roman-to-integer/
