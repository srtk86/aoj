package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_7_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String[] scores = in.readLine().split(" ");
        int m = Integer.parseInt(scores[0]);
        int f = Integer.parseInt(scores[1]);
        int r = Integer.parseInt(scores[2]);

        if (m == -1 && f == -1 && r == -1) break;

        if (m == -1 || f == -1) {
          System.out.println("F");
          continue;
        }
        if (m + f >= 80) {
          System.out.println("A");
        } else if (m + f >= 65) {
          System.out.println("B");
        } else if (m + f >= 50) {
          System.out.println("C");
        } else if (m + f >= 30) {
          if (r >= 50) {
            System.out.println("C");
          } else {
            System.out.println("D");
          }
        } else {
          System.out.println("F");
        }
      }
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
