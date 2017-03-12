package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_9_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String w = in.readLine().toLowerCase();
      int cnt = 0;
      while (true) {
        boolean isEnd = false;
        String[] words = in.readLine().split(" ");
        for (String word : words) {
          if (word.equals("END_OF_TEXT")) {
            isEnd = true;
            break;
          }
          if (word.toLowerCase().equals(w)) {
            cnt++;
          }
        }
        if (isEnd) {
          System.out.println(cnt);
          break;
        }
      }

    } catch (IOException e) {
      // ignore
    }
  }
}
