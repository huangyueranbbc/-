package js.t50;

/**
 * 题目：求100之内的素数
 */
public class t27 {
	public static void main(String[] args) {
		System.out.println(2);
		System.out.println(3);
		for (int i = 4; i <= 100; i++) {
			boolean flag = false;

			for (int j = 2; j <= Math.sqrt(i); j++) {
				if (i % j == 0) {
					flag = false;
					break;
				} else {
					flag = true;
				}
			}

			if (flag == true) {
				System.out.println(i);
			}
		}
	}
}
