package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_4_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      while (true) {
        String[] ss = in.readLine().split(" ");
        int a = Integer.parseInt(ss[0]);
        String op = ss[1];
        int b = Integer.parseInt(ss[2]);

        if (op.equals("?")) break;

        int res = 0;
        switch (op) {
          case "+":
            res = a + b; break;
          case "-":
            res = a - b; break;
          case "*":
            res = a * b; break;
          case "/":
            res = a / b; break;
        }
        System.out.println(res);
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
