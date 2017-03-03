package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ITP1_8_C {

  public static void main(String[] args) {

    try {
      Map<Character, Integer> alphabets = new HashMap<Character, Integer>();
      for (char c = 'a'; c <= 'z'; c++) {
        alphabets.put(c, 0);
      }

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String ns = null;
      while ((ns = in.readLine()) != null) {
        char[] chs = ns.toLowerCase().toCharArray();
        for (char ch : chs) {
          if (alphabets.containsKey(ch)) {
            alphabets.put(ch, alphabets.get(ch) + 1);
          }
        }
      }

      for (char c = 'a'; c <= 'z'; c++) {
        System.out.println(c + " : " + alphabets.get(c));
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
