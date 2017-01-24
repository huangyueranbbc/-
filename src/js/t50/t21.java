package js.t50;

/**
 * 题目：求1+2!+3!+...+20!的和
 */
public class t21 {
	public static void main(String[] args) {
		long sum=0;
		long num=1;
		for(int i=1;i<=20;i++){
			num=num*i;
			sum=sum+num;
		}
		System.out.println(sum);
	}
}
