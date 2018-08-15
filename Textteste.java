class Textteste{
public static void main(String[] args) {
  //Rotacionar String (rotate) 0.1 pts
  //  Dada uma String de entrada rotacioná-la em sentido horário.

  //Casos de Teste:

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
  System.out.println(Text.rotate("345").equals("534"));
    System.out.println(Text.rotate("123").equals("312"));
}
}
