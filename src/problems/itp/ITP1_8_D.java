package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_8_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String s = in.readLine();
      String ss = s + s;
      String p = in.readLine();

      if (ss.contains(p)) {
        System.out.println("Yes");
      } else {
        System.out.println("No");
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
