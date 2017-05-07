package problems.alds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class ALDS1_2_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      String[] ss = in.readLine().split(" ");
      int[] nums = Stream.of(ss).mapToInt(Integer::parseInt).toArray();

      int cnt = 0;
      for (int i = 0; i < n; i++) {
        for (int j = n - 1; j > i; j--) {
          if (nums[j] < nums[j - 1]) {
            cnt++;
            int tmp = nums[j];
            nums[j] = nums[j - 1];
            nums[j - 1] = tmp;
          }
        }
      }

      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < n; i++) {
        if (i != 0) sb.append(" ");
        sb.append(nums[i]);
      }
      System.out.println(sb.toString());
      System.out.println(cnt);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
