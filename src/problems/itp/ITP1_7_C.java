package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_7_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] rc = in.readLine().split(" ");
      int r = Integer.parseInt(rc[0]);
      int c = Integer.parseInt(rc[1]);
      int[][] res = new int[r+1][c+1];

      for (int i = 0; i < r; i++) {
        String[] row = in.readLine().split(" ");
        int sum = 0;
        for (int j = 0; j < c; j++) {
          res[i][j] = Integer.parseInt(row[j]);
          sum += res[i][j];
        }
        res[i][c] = sum;
      }

      int gSum = 0;
      for (int j = 0; j < c; j++) {
        int sum = 0;
        for (int i = 0; i < r; i++) {
          sum += res[i][j];
        }
        res[r][j] = sum;
        gSum += sum;
      }
      res[r][c] = gSum;

      for (int i = 0; i <= r; i++) {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j <= c; j++) {
          sb.append(res[i][j]);
          if (j < c) {
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
