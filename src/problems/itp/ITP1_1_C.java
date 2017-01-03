package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_1_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] ab = in.readLine().split(" ");
      int a = Integer.parseInt(ab[0]);
      int b = Integer.parseInt(ab[1]);

      int area = a * b;
      int length = 2 * (a + b);
      System.out.println(area + " " + length);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
