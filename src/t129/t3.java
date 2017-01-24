package t129;

public class t3 {
	public static void swap(String[] s, int i, int j) {
		String temp;
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

	public static void main(String[] args) {
		String[] sss = { "1", "2", "3", "4", "5", "6", "7", "8", "9" };
		arrange(sss, 0, sss.length);
	}

	private static void arrange(String[] sss, int l, int length) {
		if (l == length - 1) {
			int[] num = new int[9];
			for (int i = 0; i < length; i++) {
				num[i] = Integer.parseInt(sss[i]);
			}
			if ((num[0] * 10 + num[1]) * (num[2] * 10 + num[3]) == (num[4] * 10 + num[5])
					* (num[6] * 100 + num[7] * 10 + num[8])) {
				for (int i = 0; i < length; i++) {
					System.out.print(sss[i]);
				}
				System.out.println();
			}

		} else {
			for (int i = l; i < length; i++) {
				swap(sss, i, l);
				arrange(sss, l + 1, length);
				swap(sss, i, l);
			}
		}
	}

}
