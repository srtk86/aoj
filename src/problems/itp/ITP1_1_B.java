package problems.itp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ITP1_1_B {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int x = Integer.parseInt(in.readLine());
		System.out.println(x * x * x);
	}
}
