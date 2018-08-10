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
System.out.print("potencia(-2, 4) == 16 ");
System.out.println(potencia(2, 4) == 16);
// Casos não cobertos: expoente negativo
System.out.print("potencia(2, -3) == 0 ");
System.out.println(potencia(2, -3) == 0);
System.out.print("potencia(7, -2) == 0 ");
System.out.println(potencia(7, -2) == 0);
// Adicione mais 2 Casos de Teste
```

### Mínimo Múltiplo Comum (MMC) 0.1 pts

Criar um método para calcular o MMC, Mínimo Múltiplo Comum, entre dois, três e até quatro números.

**Restrição: nesta parte não pode usar o operador módulo `%` (resto)**

Casos de teste:

```java
int num1 = 5;
int num2 = 2;
int resp = mmc(num1, num2);

System.out.println(resp); // imprime 10
System.out.println(resp == 10); // imprime true

// Casos de Teste:
System.out.println(mmc(10, 4) == 20);
System.out.println(mmc(29, 11) == 319);
// Excepcionais
System.out.println(mmc(-2, 9) == 18);
System.out.println(mmc(-2, -9) == 18);
System.out.println(mmc(-8823, 9982) == 88071186);
// Compostos
System.out.println(mmc(mmc(2, 9), 11) == 198);
System.out.println(mmc(mmc(mmc(2, 9), 11), 17) == 3366);
// Sobrecarga para até quatro parâmetros/argumentos
System.out.println(mmc(5, 8, 91) == 3640);
System.out.println(mmc(5, 8, 91, 101) == 367640);
// Adicione mais 2 Casos de Teste:
```

Use o Wolfram Alpha como oráculo para criar novos testes, por exemplo: <https://www.wolframalpha.com/input/?i=lcm(5,+8,+91,+101)>

### Rotacionar String (_rotate_) 0.1 pts

Dada uma `String` de entrada rotacioná-la em sentido horário.

Casos de Teste:

```java
String s1 = "worf";
String s2 = Text.rotate(s1);
System.out.println(s1); // worf
System.out.println(s2); // fwor
System.out.println(s2.equals("fwor") == true); // true
String s3 = Text.rotate(s2);
System.out.println(s3); // rfwo
System.out.println(s3.equals("rfwo") == true); // true
System.out.println(Text.rotate("kira").equals("akir") == true);
System.out.println(Text.rotate(Text.rotate(s3)).equals("worf") == true);
// Casos Especiais
System.out.println(Text.rotate("").equals("") == true);
System.out.println(Text.rotate("a").equals("a") == true);
System.out.println(Text.rotate("aa").equals("aa") == true);
// Adicione mais 2 Casos de Teste
```

### Desbastar String (_chop_) 0.1 pts

Implementar o método `chop`, em classe separada `Text`, que toma uma `String` de entrada e devolve outra sem o último caractere.

Casos de Teste:

```java
String s1 = "seven of nine";
String s2 = Text.chop(s1);
System.out.println(s1); // seven of nine
System.out.println(s2); // seven of nin
System.out.println(s2.equals("seven of nin") == true); // true
String s3 = Text.chop(s2);
System.out.println(s3); // seven of ni
System.out.println(s3.equals("seven of ni") == true); // true
System.out.println(Text.chop("spock").equals("spoc") == true);
// Casos Especiais
System.out.println(Text.chop("Q").equals("") == true);
System.out.println(Text.chop("").equals("") == true);
System.out.println(Text.chop(Text.chop(Text.chop("abc"))).equals("") == true);
// Adicione mais 2 Casos de Teste:
```

### Valor absoluto de um número 0.1 pts

Especificar, implementar e testar um método que resolva o valor absoluto de um número `|n|`. Isto é, tens de especificar as regras válidas para entrada e saída bem como definir os casos de teste.

Referências:

<https://pt.wikipedia.org/wiki/Valor_absoluto>

<https://pt.khanacademy.org/math/arithmetic/absolute-value>

[* First Contact](https://www.youtube.com/watch?v=2orQxtEmtjE)
