package guanwang.shuati;

import java.util.Scanner;

public class t3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		for (int i = 10000; i <= 99999; i++) {
			int f1 = i / 10000;
			int f2 = i / 1000 % 10;
			int f4 = i / 10 % 10;
			int f5 = i % 10;
			int f3 = i / 100 % 10;
			if (f1 == f5 && f2 == f4) {
				if (f1 + f2 + f3 + f4 + f5 == n) {
					System.out.println(i);
				}
			}
		}
		for (int i = 100000; i <= 999999; i++) {
			int f1 = i / 100000;
			int f2 = i / 10000 % 10;
			int f3 = i / 1000 % 10;
			int f4 = i / 100 % 10;
			int f5 = i / 10 % 10;
			int f6 = i % 10;
			if (f1 == f6 && f2 == f5 && f3 == f4) {
				if (f1 + f2 + f3 + f4 + f5 + f6 == n) {
					System.out.println(i);
				}
			}
		}
	}
}
