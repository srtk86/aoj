package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_5_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String[] ab = in.readLine().split(" ");
        int h = Integer.parseInt(ab[0]);
        int w = Integer.parseInt(ab[1]);

        if (h == 0 && w == 0) break;
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < w; j++) {
          sb.append("#");
        }
        for (int i = 0; i < h; i++) {
          System.out.println(sb.toString());
        }
        System.out.println();
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
