package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_6_C {

  public static void main(String[] args) {

    try {
      int[][][] tenants = new int[4][3][10];

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());

      for (int i = 0; i < n; i++) {
        String[] info = in.readLine().split(" ");
        int t = Integer.parseInt(info[0]);
        int f = Integer.parseInt(info[1]);
        int r = Integer.parseInt(info[2]);
        int num = Integer.parseInt(info[3]);

        tenants[t-1][f-1][r-1] += num;
      }

      boolean first = true;
      for (int[][] tenant : tenants) {
        if (!first) {
          System.out.println("####################");
        }
        for (int[] floor : tenant) {
          StringBuilder sb = new StringBuilder();
          for (int room : floor) {
            sb.append(" " + room);
          }
          System.out.println(sb.toString());
        }

        first = false;
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
