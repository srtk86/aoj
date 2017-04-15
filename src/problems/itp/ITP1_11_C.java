package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_11_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String[] eyes1 = in.readLine().split(" ");
      Dice dice1 = new Dice(
          Integer.parseInt(eyes1[0]),
          Integer.parseInt(eyes1[1]),
          Integer.parseInt(eyes1[2]),
          Integer.parseInt(eyes1[3]),
          Integer.parseInt(eyes1[4]),
          Integer.parseInt(eyes1[5])
          );
      String[] eyes2 = in.readLine().split(" ");
      Dice dice2 = new Dice(
          Integer.parseInt(eyes2[0]),
          Integer.parseInt(eyes2[1]),
          Integer.parseInt(eyes2[2]),
          Integer.parseInt(eyes2[3]),
          Integer.parseInt(eyes2[4]),
          Integer.parseInt(eyes2[5])
          );
      char[] rolls = "EEEESEEEESEEEESEEEESESEEEESEEEESEEEESEEEES".toCharArray();
      for (char roll : rolls) {
        dice1.roll(roll);
        if (dice1.equals(dice2)) {
          System.out.println("Yes");
          return;
        }
      }
      System.out.println("No");

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
