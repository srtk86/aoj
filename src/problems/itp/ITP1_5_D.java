package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_5_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());

      StringBuilder sb = new StringBuilder();
      for (int i = 1; i <= n; i++) {
        if (i % 3 == 0) {
          sb.append(" " + i);
          continue;
        }
        int m = i;
        while (m > 0) {
          if (m % 10 == 3) {
            sb.append(" " + i);
            break;
          }
          m /= 10;
        }
      }
      System.out.println(sb.toString());

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
