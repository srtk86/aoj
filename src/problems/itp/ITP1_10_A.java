package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_10_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] dots = in.readLine().split(" ");
      double x1 = Double.parseDouble(dots[0]);
      double y1 = Double.parseDouble(dots[1]);
      double x2 = Double.parseDouble(dots[2]);
      double y2 = Double.parseDouble(dots[3]);

      System.out.println(Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1)));

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
