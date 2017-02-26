package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_8_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String ns = in.readLine();
        if (ns.equals("0")) break;
        
        int sum = 0;
        char[] chs = ns.toCharArray();
        for (char ch : chs) {
          sum += Character.getNumericValue(ch);
        }
        System.out.println(sum);
      }
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
