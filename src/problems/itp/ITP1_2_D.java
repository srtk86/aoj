package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_2_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] params = in.readLine().split(" ");

      int W = Integer.parseInt(params[0]);
      int H = Integer.parseInt(params[1]);
      int x = Integer.parseInt(params[2]);
      int y = Integer.parseInt(params[3]);
      int r = Integer.parseInt(params[4]);

      if (x - r >= 0 && x + r <= W && y - r >= 0 && y + r <= H) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
