# AVA 00: procedimentos

> Minha solução em Java para o trabalho da disciplina de Programação Orientada a Objetos (IFRS, 2018). Tema: procedimentos e lógica básica em Java. O enunciado original está logo abaixo.

---

First Contact*: lógica, procedimetos, especificação, implementação, testes
==========================================================================
Deu certo [:)](https://raw.githubusercontent.com/poo-2018-2/ava-00-procedimentos/master/yes.jpg)
Deu errado [:(](https://raw.githubusercontent.com/poo-2018-2/ava-00-procedimentos/master/no.jpg)


* * *


## Implementar usando métodos e testar segundo as especificações


#### Prazo: 2018-08-19 Peso: 0.5 pts


**Restrição: não podem ser usadas as bibliotecas do Java, por exemplo, a classe `Math`, `Scanner`, etc, inclusive os métodos de Integer, como `parseInt` ou métodos de String, EXCETO `length`, `charAt` e `equals`; Os Casos de Teste podem ser corrigidos, mas a especificação não pode ser alterada.**


### Exponenciação 0.1 pts


Implementar um método para fazer potência de inteiros.


Casos de teste:


```java
// método potencia que entram dois inteiros e sai um inteiro
// potencia(int,int):int


int base = 3;
int expoente = 4;
int result = potencia(base, expoente);
System.out.println(result); // imprime 81
System.out.println(result == 81); // imprime true


// Casos de Teste:
System.out.print("potencia(3, 2) == 9 "); // 3 ao quadrado
System.out.println(potencia(3, 2) == 9); // 3 ao quadrado
System.out.print("potencia(2, 3) == 8 "); // 2 ao cubo
System.out.println(potencia(2, 3) == 8); // 2 ao cubo
// Números grandes
System.out.print("potencia(23, 6) == 148035889 ");
System.out.println(potencia(23, 6) == 148035889);
System.out.print("potencia(2, 30) == 1073741824 ");
System.out.println(potencia(2, 30) == 1073741824);
// Casos Especiais: bases negativas
System.out.print("potencia(-2, 3) == -8 ");
System.out.println(potencia(-2, 3) == -8);
