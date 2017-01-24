package t129;

/**
 * 看这个算式： ☆☆☆ + ☆☆☆ = ☆☆☆ 如果每个五角星代表 1 ~ 9 的不同的数字。 这个算式有多少种可能的正确填写方法？
 * 
 */
public class t12 {
	static int count=0;
	public static void swap(int[] sss, int i, int j) {
		int temp;
		temp = sss[i];
		sss[i] = sss[j];
		sss[j] = temp;
	}

	public static void arrange(int[] sss, int l, int len) {
		if (l == len - 1) {
			if (sss[0] * 100 + sss[1] * 10 + sss[2] + sss[3] * 100 + sss[4] * 10 + sss[5] == sss[6] * 100 + sss[7] * 10
					+ sss[8]) {
				System.out.println(sss[0] + "" + sss[1] + "" + sss[2] + "+" + sss[3] + sss[4] + sss[5] + "=" + sss[6]
						+ sss[7] + sss[8]);
				count++;
			}
		} else {
			for (int i = l; i < len; i++) {
				swap(sss, i, l);
				arrange(sss, l + 1, len);
				swap(sss, i, l);
			}
		}
	}

	public static void main(String[] args) {
		int[] sss = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		arrange(sss, 0, sss.length);
		System.err.println(count);
	}
}
