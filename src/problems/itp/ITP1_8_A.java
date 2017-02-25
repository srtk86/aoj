package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_8_A {

  public static void main(String[] args) {
    
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      char[] chs = in.readLine().toCharArray();
      
      StringBuilder sb = new StringBuilder();
      for (Character ch : chs) {
        if (Character.isUpperCase(ch)) {
          sb.append(Character.toLowerCase(ch));
        } else {
          sb.append(Character.toUpperCase(ch));
        }
      }
      System.out.println(sb.toString());
    } catch (IOException e) {
      // ignore
    }
  }
}
