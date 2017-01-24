package t129;

public class t1 {
	public static void swap(String[] s, int i, int j) {
		String temp;
		temp = s[i];
		s[i] = s[j];
		s[j] = temp;
	}

	public static void main(String[] args) {
		String[] sss = { "A", "B", "C" };
		arrange(sss, 0, sss.length);
	}

	private static void arrange(String[] sss, int l, int length) {
		if (l == length - 1) {
			for (int i = 0; i < length; i++) {
				System.out.print(sss[i]);
			}
			System.out.println();
		}else {
			for(int i=l;i<length;i++){
				swap(sss,i,l);
				arrange(sss, l+1, length);
				swap(sss,i,l);
			}
		}
	}

}
