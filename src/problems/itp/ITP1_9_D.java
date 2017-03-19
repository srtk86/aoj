package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_9_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      String word = in.readLine();
      int cnt = Integer.parseInt(in.readLine());
      for (int i = 0; i < cnt; i++) {
        String[] commands = in.readLine().split(" ");
        String command = commands[0];
        int beginIndex = Integer.parseInt(commands[1]);
        int endIndex = Integer.parseInt(commands[2]);
        if (command.equals("print")) {
          System.out.println(word.substring(beginIndex, endIndex + 1));
        } else if (commands[0].equals("reverse")) {
          String subStr = word.substring(beginIndex, endIndex + 1);
          StringBuilder sb = new StringBuilder(subStr);
          String reverseSubStr = sb.reverse().toString();
          word = word.substring(0, beginIndex) + reverseSubStr + word.substring(endIndex + 1);
        } else if (commands[0].equals("replace")) {
          String replaceSubStr = commands[3];
          word = word.substring(0, beginIndex) + replaceSubStr + word.substring(endIndex + 1);
        }
      }
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
