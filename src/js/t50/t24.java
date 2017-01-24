package js.t50;

import java.util.Scanner;

/**
 * 题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
 */
public class t24 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		String s=i+"";
		char[] n=s.toCharArray();
		System.out.println("是"+n.length+"位数！");
		
		for(int j=n.length-1;j>=0;j--){
			System.out.print(n[j]);
		}
	}
}
