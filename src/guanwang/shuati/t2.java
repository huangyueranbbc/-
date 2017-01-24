package guanwang.shuati;

import java.util.Scanner;

public class t2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int[] n = new int[num];
		for (int i = 0; i < num; i++) {
			n[i] = in.nextInt();
		}
		for (int i = 0; i < n.length; i++) {
			for (int j = i + 1; j < n.length; j++) {
				if (n[i] > n[j]) {
					int temp = n[i];
					n[i] = n[j];
					n[j] = temp;
				}
			}
		}

		for (int i = 0; i < n.length; i++) {
			System.out.print(n[i] + " ");
		}

	}
}
