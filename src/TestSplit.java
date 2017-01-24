
public class TestSplit {
	
	public static void main(String[] args) {
		String ids="15,16,26,37";
		String[] id = ids.split(",");
		for(String i:id){
			System.out.println(i);
		}
	}
}
