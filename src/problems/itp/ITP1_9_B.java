package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_9_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String word = in.readLine();
        if (word.equals("-")) break;

        int cnt = Integer.parseInt(in.readLine());
        for (int i = 0; i < cnt; i++) {
          int h = Integer.parseInt(in.readLine());
          word = word.substring(h) + word.substring(0, h);
        }
        System.out.println(word);
      }
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
