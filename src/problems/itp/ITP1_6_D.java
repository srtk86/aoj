package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_6_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] nm = in.readLine().split(" ");
      int n = Integer.parseInt(nm[0]);
      int m = Integer.parseInt(nm[1]);

      int[][] a = new int[n][m];
      int[] b = new int[m];

      for (int i = 0; i < n; i++) {
        String[] row = in.readLine().split(" ");
        for (int j = 0; j < m; j++) {
          a[i][j] = Integer.parseInt(row[j]);
        }
      }
      for (int i = 0; i < m; i++) {
        b[i] = Integer.parseInt(in.readLine());
      }

      for (int i = 0; i < n; i++) {
        int res = 0;
        for (int j = 0; j < m; j++) {
          res += a[i][j] * b[j];
        }
        System.out.println(res);
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
