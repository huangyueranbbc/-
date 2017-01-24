package js.t50;

import java.util.Scanner;

/**
 * 题目：利用条件运算符的嵌套来完成此题：学习成绩> =90分的同学用A表示，60-89分之间的用B表示，60分以下的用C表示。
 */
public class t5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		if (n >= 90) {
			System.out.println("A");
		} else if (n >= 60 && n <= 89) {
			System.out.println("B");
		} else {
			System.out.println("C");
		}
	}
}
