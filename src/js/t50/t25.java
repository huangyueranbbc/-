package js.t50;

/**
 * 题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
 */
public class t25 {
	public static void main(String[] args) {
		for (int i = 10000; i <= 99999; i++) {
			int i1 = i / 10000;
			int i2 = i / 1000 % 10;
			int i3 = i / 100 % 10;
			int i4 = i / 10 % 10;
			int i5 = i % 10;
			if (i1 == i5 && i2 == i4) {
				System.out.println(i);
			}
		}
	}
}
