package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_9_C {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      int taroScore = 0;
      int hanakoScore = 0;
      for (int i = 0; i < n; i++) {
        String[] cards = in.readLine().split(" ");
        String taroCard = cards[0];
        String hanakoCard = cards[1];
        int res = taroCard.compareTo(hanakoCard);
        if (res < 0) {
          hanakoScore += 3;
        } else if (res > 0) {
          taroScore += 3;
        } else {
          taroScore++;
          hanakoScore++;
        }
      }
      System.out.println(taroScore + " " + hanakoScore);

    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
