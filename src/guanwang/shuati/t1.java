package guanwang.shuati;

import java.util.Scanner;

public class t1 {
	public static void main(String[] args) {
		int f1 = 1, f2 = 1, fn = 0;
		int n = new Scanner(System.in).nextInt();
		for (int i = 3; i <= n; i++) {
			fn = f2 + f1;
			f1 = f2;
			f2 = fn;
		}
		System.out.println(fn % 10007);
	}
}
