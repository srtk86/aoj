package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_10_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        int n = Integer.parseInt(in.readLine());
        if (n == 0) break;
        
        String[] scores = in.readLine().split(" ");
        double m = 0;
        for (String score : scores) {
          m += Integer.parseInt(score); 
        }
        m /= n;
        
        double a2 = 0;
        for (String score : scores) {
          double scoreDouble = Double.parseDouble(score);
          a2 += (scoreDouble - m) * (scoreDouble - m);
        }
        a2 /= n;
        System.out.println(Math.sqrt(a2));
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
