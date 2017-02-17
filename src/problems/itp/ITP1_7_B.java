package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_7_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String[] nx = in.readLine().split(" ");
        int n = Integer.parseInt(nx[0]);
        int x = Integer.parseInt(nx[1]);
        if (n == 0 && x == 0) break;

        int cnt = 0;
        for (int i = x / 3; i <= n; i++) {
          for (int j = 1; j < i; j++) {
            for (int k = 1; k < j; k++) {
              if (i + j + k == x) {
                cnt++;
              }
            }
          }
        }
        System.out.println(cnt);
      }
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
