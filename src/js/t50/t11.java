package js.t50;

/**
 * 题目：有1、2、3、4四个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？
 */
public class t11 {
	public static void main(String[] args) {
		int count = 0;
		for (int i1 = 1; i1 <= 4; i1++) {
			for (int i2 = 1; i2 <= 4; i2++) {
				for (int i3 = 1; i3 <= 4; i3++) {
					if (i1 != i2 && i2 != i3 && i1 != i3) {
						count++;
						System.out.println(i1 * 100 + i2 * 10 + i3);
					}

				}
			}
		}
		System.out.println("共有" + count + "个三位数");
	}

}
