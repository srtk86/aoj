package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ITP1_2_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] ss = in.readLine().split(" ");
      int[] abc = Stream.of(ss).mapToInt(Integer::parseInt).toArray();

      for (int i = 1; i < abc.length; i++) {
        for (int j = i; j > 0; j--) {
          if (abc[j] < abc[j - 1]) {
            int tmp = abc[j];
            abc[j] = abc[j - 1];
            abc[j - 1] = tmp;
          }
        }
      }

      System.out.println(abc[0] + " " + abc[1] + " " + abc[2]);

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
