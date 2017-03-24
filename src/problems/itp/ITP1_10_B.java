package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_10_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] dots = in.readLine().split(" ");
      double a = Double.parseDouble(dots[0]);
      double b = Double.parseDouble(dots[1]);
      double C = Double.parseDouble(dots[2]);

      System.out.println(a * b * Math.sin(C / 180 * Math.PI) * 0.5);
      System.out.println(a + b + Math.sqrt(a * a + b * b - 2 * a * b * Math.cos(C / 180 * Math.PI)));
      System.out.println(b * Math.sin(C / 180 * Math.PI));

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
