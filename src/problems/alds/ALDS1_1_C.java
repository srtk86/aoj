package problems.alds;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class ALDS1_1_C {

  private static List<Integer> primes = new ArrayList<Integer>();

  public static void main(String[] args) {

    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
      int n = Integer.parseInt(in.readLine());
      int cnt = 0;
      for (int i = 0; i < n; i++) {
        int p = Integer.parseInt(in.readLine());
        if (isPrime(p)) {
          cnt++;
        }
      }
      System.out.println(cnt);
    } catch (NumberFormatException | IOException e) {
      // ignore
    }
  }

  private static boolean isPrime(int n) {
    if (primes.contains(n)) {
      return true;
    }
    if (!primes.isEmpty() && primes.get(primes.size() - 1) > n) {
      return false;
    }
    int f = primes.isEmpty() ? 2 : primes.get(primes.size() - 1);
    for (int i = f; i * i <= n; i++) {
      boolean isPrime = true;
      for (int p : primes) {
        if (i % p == 0) {
          isPrime = false;
          break;
        }
        if (p * p > i) {
          break;
        }
      }
      if (isPrime) {
        primes.add(i);
      }
    }

    boolean isPrime = true;
    for (int p : primes) {
      if (n % p == 0) {
        isPrime = false;
        break;
      }
    }
    return isPrime;
  }
}
