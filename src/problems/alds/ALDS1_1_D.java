package problems.alds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ALDS1_1_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      int max = Integer.MIN_VALUE;
      int min = Integer.MAX_VALUE;
      for (int i = 0; i < n; i++) {
        int r = Integer.parseInt(in.readLine());
        max = Math.max(max, r - min);
        min = Math.min(min, r);
      }
      System.out.println(max);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
