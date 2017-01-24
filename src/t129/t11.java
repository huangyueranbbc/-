package t129;

/**
 * 今年的植树节（2012年3月12日），小明和他的叔叔还有小伙伴们一起去植树。
 * 休息的时候，小明的同学问他叔叔多大年纪，他叔叔说：“我说个题目，看你们谁先猜出来！”
 * “把我出生的年月日连起来拼成一个8位数（月、日不足两位前补0）正好可以被今天的年、月、日整除！” 他想了想，又补充到：“再给个提示，我是6月出生的。”
 * 根据这些信息，请你帮小明算一下，他叔叔的出生年月日。
 * 
 */
public class t11 {
	public static void main(String[] args) {
		for (int i = 1900; i < 2012; i++) {
			for (int j = 1; j <= 31; j++) {
				String month;
				if (j < 10) {
					month = "0" + j;
				} else {
					month = "" + j;
				}
				String s = i + "" + "06" + month;

				int num = Integer.parseInt(s);
				if (num % 2012 == 0 && num % 3 == 0 && num % 12 == 0) {
					System.out.println(s);
				}
			}
		}
	}
}
