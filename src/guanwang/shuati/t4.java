package guanwang.shuati;

import java.util.Scanner;

//10进制转换16进制
public class t4 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		
		System.out.println(Integer.toHexString(n));
	}
}
