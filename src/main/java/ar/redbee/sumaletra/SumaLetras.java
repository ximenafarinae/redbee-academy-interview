package ar.redbee.sumaletra;

import java.util.List;

public class SumaLetras {

  public static final String ALFABETO = "abcdefghijklmnopqrstuvwxyz";

  public static Character sumar(List<Character> charArray) {
    if (charArray.isEmpty()) {
      return 'z';
    }
    int suma = 0;
    for (int i = 0; i < charArray.size(); i++) {
      suma += convertirANumero(charArray.get(i));
    }
    return convertirALetra(suma % (ALFABETO.length()));
  }

  private static Integer convertirANumero(Character letra) {
    return ALFABETO.indexOf(letra) + 1;
  }

  private static Character convertirALetra(Integer numero) {
    return ALFABETO.charAt(numero - 1);
  }
}
