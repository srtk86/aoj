package problems.alds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ALDS1_1_A {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      String[] ss = in.readLine().split(" ");
      int[] nums = new int[n];
      for (int i = 0; i < n; i++) {
        nums[i] = Integer.parseInt(ss[i]);
      }

      for (int i = 0; i < nums.length; i++) {
        int key = nums[i];
        int j = i - 1;
        while (j >= 0 && nums[j] > key) {
          nums[j+1] = nums[j];
          j--;
        }
        nums[j+1] = key;

        StringBuilder sb = new StringBuilder();
        for (int k = 0; k < nums.length; k++) {
          if (k > 0) {
            sb.append(" ");
          }
          sb.append(nums[k]);
        }
        System.out.println(sb.toString());
      }
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
