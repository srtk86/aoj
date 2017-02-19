package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_7_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] nml = in.readLine().split(" ");
      int n = Integer.parseInt(nml[0]);
      int m = Integer.parseInt(nml[1]);
      int l = Integer.parseInt(nml[2]);

      int[][] a = new int[n][m];
      int[][] b = new int[m][l];

      for (int i = 0; i < n; i++) {
        String[] row = in.readLine().split(" ");
        for (int j = 0; j < m; j++) {
          a[i][j] = Integer.parseInt(row[j]);
        }
      }
      for (int j = 0; j < m; j++) {
        String[] row = in.readLine().split(" ");
        for (int k = 0; k < l; k++) {
          b[j][k] = Integer.parseInt(row[k]);
        }
      }

      for (int i = 0; i < n; i++) {
        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < l; k++) {
          long sum = 0;
          for (int j = 0; j < m; j++) {
            sum += a[i][j] * b[j][k];
          }
          sb.append(sum);
          if (k < l - 1) {
            sb.append(" ");
          }
        }
        System.out.println(sb.toString());
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
