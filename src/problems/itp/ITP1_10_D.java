package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_10_D {

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      String[] x = in.readLine().split(" ");
      String[] y = in.readLine().split(" ");
      
      double m1 = 0;
      double m2 = 0;
      double m3 = 0;
      double mInf = 0;
      for (int i = 0; i < n; i++) {
        double xi = Double.parseDouble(x[i]);
        double yi = Double.parseDouble(y[i]);
        m1 += Math.abs(xi - yi);
        m2 += Math.pow((xi - yi), 2);
        m3 += Math.pow(Math.abs(xi - yi), 3);
        mInf = (Math.abs(xi - yi) > mInf) ? Math.abs(xi - yi) : mInf;
      }
      System.out.println(m1);
      System.out.println(Math.sqrt(m2));
      System.out.println(Math.pow(m3, 1.0 / 3));
      System.out.println(mInf);
      
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }
}
