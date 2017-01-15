package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String[] ab = in.readLine().split(" ");
        int a = Integer.parseInt(ab[0]);
        int b = Integer.parseInt(ab[1]);

        if (a == 0 && b == 0) break;
        if (a < b) {
          System.out.println(a + " " + b);
        } else {
          System.out.println(b + " " + a);
        }
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
