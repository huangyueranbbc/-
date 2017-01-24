package js.t50;

/**
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，小兔子长到第三个月后每个月又生一对兔子， 假如兔子都不死，问每个月的兔子总数为多少？ 1
 * 1 2 3
 */
public class t1 {
	public static void main(String[] args) {
		int f1 = 1, f2 = 1, f, m = 24;
		for (int i = 3; i <= 24; i++) {
			f = f2;
			f2 = f2 + f1;
			f1 = f;
			System.out.println("第" + i + "个月的兔子对数: " + f2);
		}
	}
}
