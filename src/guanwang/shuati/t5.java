package guanwang.shuati;

import java.util.Scanner;

public class t5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int r = in.nextInt();
		double mianji = 0;
		double pi = Math.PI;
		double banjin = r;
		mianji = pi * r * r;
		System.out.println(mianji);
		System.out.println(String.format("%.7f", mianji));
	}
}
