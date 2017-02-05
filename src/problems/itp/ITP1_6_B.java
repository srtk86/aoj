package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ITP1_6_B {

  public static void main(String[] args) {

    try {
      List<String> cards = new ArrayList<String>();
      String[] suits = {"S", "H", "C", "D"};
      for (String suit : suits) {
        for (int i = 1; i <= 13; i++) {
          cards.add(suit + " " + i);
        }
      }

      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      for (int i = 0; i < n; i++) {
        String card = in.readLine();
        if (cards.contains(card)) {
          cards.remove(card);
        }
      }

      for (String card : cards) {
        System.out.println(card);
      }

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
