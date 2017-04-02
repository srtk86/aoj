package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_11_A {

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

      char[] rolls = in.readLine().toCharArray();
      for (char roll : rolls) {
        dice.roll(roll);
      }
      System.out.println(dice.eye());

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
