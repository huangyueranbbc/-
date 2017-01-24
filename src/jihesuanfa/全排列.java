package jihesuanfa;

public class 全排列 {
	public static void swap(String[] str, int i, int j) {
		String s;
		s = str[i];
		str[i] = str[j];
		str[j] = s;
	}

	public static void main(String[] args) {
		String[] sss = { "A", "B", "C" };
		arrange(sss, 0, sss.length);
	}

	private static void arrange(String[] sss, int l, int length) {
		if (l == length - 1) {
			// 打印
			for (int i = 0; i < length; i++) {
				System.out.print(sss[i]);
			}
			System.out.println();
		} else {
			for (int i = l; i < length; i++) {
				swap(sss, l, i);
				arrange(sss, l + 1, length);
				swap(sss, l, i);
			}
		}
	}
}
