package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_11_B {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] eyes = in.readLine().split(" ");
      Dice dice = new Dice(
          Integer.parseInt(eyes[0]),
          Integer.parseInt(eyes[1]),
          Integer.parseInt(eyes[2]),
          Integer.parseInt(eyes[3]),
          Integer.parseInt(eyes[4]),
          Integer.parseInt(eyes[5])
          );

      int n = Integer.parseInt(in.readLine());
      for (int i = 0; i < n; i++) {
        String[] hf = in.readLine().split(" ");
        int head = Integer.parseInt(hf[0]);
        int face = Integer.parseInt(hf[1]);
        System.out.println(dice.leftEar(head, face));
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
