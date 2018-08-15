class abs {
  static int abs(int n) {
    if (n < 0) n = n * -1;

    return (n);
  }

  public static void main(String[] args) {
    int n = 4;
    int resposta = abs (n);
    // CASO FELIZ

    System.out.println(resposta); // 4;
    System.out.println(resposta == 4); // true;
    // numeros grandes
    System.out.print(abs(1500 )); // 1500
    System.out.println(abs(1500 ) ==1500); //true
    // numeros negativos
    System.out.print(abs(-34 ));// 34
    System.out.println(abs (-34 ) == 34); //true
    // numeros grandes negativos
    System.out.print(abs(-175432 )); //  175432
    System.out.println(abs(-175432 ) == 175432 ); // true
    // zero
    System.out.print(abs(-0 ));// 0
    System.out.println(abs(-0 ) == 0);// true
  }
}
