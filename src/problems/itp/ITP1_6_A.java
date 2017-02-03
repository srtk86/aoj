package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_6_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      String[] nums = in.readLine().split(" ");

      StringBuilder sb = null;
      for (int i = n - 1; i >= 0; i--) {
        if (sb == null) {
          sb = new StringBuilder();
          sb.append(nums[i]);
        } else {
          sb.append(" " + nums[i]);
        }
      }
      System.out.println(sb.toString());

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
