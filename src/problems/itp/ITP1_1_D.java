package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_1_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int s = Integer.parseInt(in.readLine());
      int h = s / 3600;
      s -= 3600 * h;
      int m = s / 60;
      s -= 60 * m;
      System.out.println(h + ":" + m + ":" + s);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
