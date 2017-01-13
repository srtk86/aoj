package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      for (int i = 0; i < 10000; i++) {
        int num = Integer.parseInt(in.readLine());
        if (num == 0) {
          break;
        }
        System.out.println("Case " + (i + 1) + ": " + num);
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
