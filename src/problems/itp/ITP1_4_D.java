package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_4_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      String[] ss = in.readLine().split(" ");

      int min = Integer.MAX_VALUE;
      int max = Integer.MIN_VALUE;
      long sum = 0;
      for (int i = 0; i < n; i++) {
        int value = Integer.parseInt(ss[i]);
        if (min > value) min = value;
        if (max < value) max = value;
        sum += value;
      }
      System.out.println(min + " " + max + " " + sum);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
