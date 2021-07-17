package ar.redbee.sumaletra;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

public class SumaLetraTest {

  @Test
  public void testSumaLetras() {
    Assertions.assertEquals('c', SumaLetras.sumar(Arrays.asList('a', 'b')));
  }

  @Test
  public void testSumaLetrasArrayVacio() {
    Assertions.assertEquals('z', SumaLetras.sumar(Arrays.asList()));
  }

  @Test
  public void testSumaLetrasDesborde() {
    Assertions.assertEquals('a', SumaLetras.sumar(Arrays.asList('a', 'z')));
  }


}
