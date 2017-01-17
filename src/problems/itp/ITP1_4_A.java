package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigDecimal;

public class ITP1_4_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] ab = in.readLine().split(" ");
      int a = Integer.parseInt(ab[0]);
      int b = Integer.parseInt(ab[1]);

      int d = a / b;
      int r = a % b;
      double f = (double) a / b;
      System.out.println(d + " " + r + " " + BigDecimal.valueOf(f).toPlainString());

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
