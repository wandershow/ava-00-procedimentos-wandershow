class mmc{
  static int abs(int n){
    if (n < 0){
    n = n * -1;
      }
      return (n);
    }
  static int mmc(int n1, int n2){
    n1 =abs(n1);
    n2 =abs(n2);
    int m1 = n1;
    int m2 = n2;

      while  (m1 != m2) {
         if  (m1 < m2){
              m1 = m1+n1;
      }
       else
       {    m2 = m2+n2;
       }
     }

     return (m1);

  }
  // sobrecarga
  static int mmc(int n1, int n2, int n3){
    n1 =abs(n1);
    n2 =abs(n2);
    n3 =abs(n3);
        int resposta = mmc(mmc(n1, n2), n3);
       return (resposta);


     }
  //sobrecarga
  static int mmc(int n1, int n2, int n3, int n4){
    n1 =abs(n1);
    n2 =abs(n2);
    n3 =abs(n3);
    n4 =abs(n4);

    int resposta = mmc(mmc(mmc(n1, n2), n3), n4);
       return (resposta);


     }




  public static void main(String[] args) {
    //Mínimo Múltiplo Comum (MMC) 0.1 pts

    //Criar um método para calcular o MMC, Mínimo Múltiplo Comum, entre dois, três e até quatro números.

    //Restrição: nesta parte não pode usar o operador módulo % (resto)

    //Casos de teste:

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
    // simples com zero negativo
    System.out.println(mmc(-0, -0) == 0);
    System.out.println(mmc(-0, -0) == 0);
    // compostos com zero
    System.out.println(mmc(mmc(0, 0), 0) == 0);
    System.out.println(mmc(mmc(mmc(0, 0), 0), 0) == 0);
    // compostos com zero negativo
    System.out.println(mmc(mmc(-0, -0), -0) == 0);
    System.out.println(mmc(mmc(mmc(-0, -0), -0), -0) == 0);

  }
}
