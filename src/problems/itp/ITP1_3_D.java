package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_3_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      String[] abc = in.readLine().split(" ");
      int a = Integer.parseInt(abc[0]);
      int b = Integer.parseInt(abc[1]);
      int c = Integer.parseInt(abc[2]);

      int cnt = 0;
      for (int i = a; i <= b; i++) {
        if (c % i == 0) cnt++;
      }
      System.out.println(cnt);

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
