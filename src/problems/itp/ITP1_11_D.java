package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ITP1_11_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      List<Dice> dices = new ArrayList<Dice>();
      for (int i = 0; i < n; i++) {
        String[] eyes = in.readLine().split(" ");
        dices.add(new Dice(
            Integer.parseInt(eyes[0]),
            Integer.parseInt(eyes[1]),
            Integer.parseInt(eyes[2]),
            Integer.parseInt(eyes[3]),
            Integer.parseInt(eyes[4]),
            Integer.parseInt(eyes[5])
            ));
      }

      char[] rolls = "EEEESEEEESEEEESEEEESESEEEESEEEESEEEESEEEES".toCharArray();
      for (int i = 0; i < dices.size(); i++) {
        Dice dice1 = dices.get(i);
        for (int j = 0; j < i; j++) {
          Dice dice2 = dices.get(j);
          for (char roll : rolls) {
            dice1.roll(roll);
            if (dice1.equals(dice2)) {
              System.out.println("No");
              return;
            }
          }
        }
      }
      System.out.println("Yes");

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
