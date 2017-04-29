package problems.alds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ALDS1_1_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] ab = in.readLine().split(" ");
      int a = Integer.parseInt(ab[0]);
      int b = Integer.parseInt(ab[1]);
      int x = Math.max(a, b);
      int y = Math.min(a, b);
      while (x % y > 0) {
        int r = x % y;
        x = y;
        y = r;
      }
      System.out.println(y);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
