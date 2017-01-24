package js.t50;

/**
 * 题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多少米？第10次反弹多高？
 */
public class t6 {
	public static void main(String[] args) {
		double h = 100, s = 100;
		for (int i = 1; i < 10; i++) {
			s = s + h;
			h = h / 2;
		}
		System.out.println(s + ":" + h / 2);
	}
}
