class Text{
  static String chop(String s){
    String r = "";
    for (int i = 0 ;i < s.length() -1 ; i++ ) {
      if ( i != s.length() - 1 ) r = r + s.charAt(i) ;
      else r =s.charAt(i) + r ;
    }
    return r;
  }


  static String rotate(String s) {
    String r = "";
      for (int i = 0 ;i < s.length() ; i++ ) {
        if ( i != s.length() - 1 ) {
          r = r + s.charAt(i) ;}
        else { r =s.charAt(i) + r ;}
                                            }
                  return r;
          }
          // worf orfw

}
