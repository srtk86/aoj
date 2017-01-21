package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ITP1_4_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      double r = Double.parseDouble(in.readLine());
      String c = BigDecimal.valueOf(2 * r * Math.PI).toPlainString();
      String a = BigDecimal.valueOf(r * r * Math.PI).toPlainString();
      System.out.println(a + " " + c);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
