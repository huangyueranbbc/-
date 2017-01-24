package js.t50;

import java.util.Scanner;

/**
 * 题目：有n个整数，使其前面各数顺序向后移m个位置，最后m个数变成最前面的m个数
 */
public class t36 {
	public static void main(String[] args) {
		int N = 10;
		int[] a = new int[N];
		Scanner s = new Scanner(System.in);
		System.out.println("请输入10个整数：");
		for (int i = 0; i < N; i++) {
			a[i] = s.nextInt();
		}
		System.out.print("你输入的数组为：");
		for (int i = 0; i < N; i++) {
			System.out.print(a[i] + " ");
		}
		int[] b=new int[N];
		
		for(int i=5,j=0;i<b.length;i++,j++){
			b[i]=a[j];
		}
		for(int i=0,j=5;i<5;i++,j++){
			b[i]=a[j];
		}
		System.out.println();
		for (int i = 0; i < N; i++) {
			System.out.print(b[i] + " ");
		}

	}
}
