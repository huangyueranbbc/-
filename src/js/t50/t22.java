package js.t50;

/**
 * 题目：利用递归方法求5!。
 */
public class t22 {
	public static void main(String[] args) {
		f(5);
		System.out.println(f(12));
	}

	private static long f(int n) {
		long value = 0;
		if (n == 1) {
			value = 1;
		} else {
			value = f(n - 1) * n;
		}
		return value;
	}
}
