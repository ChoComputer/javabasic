package mission;

public class test3 {
	public static void main(String[] args) {

		
		long start = System.currentTimeMillis();
		System.out.println(start);

		
		long all = 0;

		for (int i = 0; i < 2000000000; i++) {
			all += i;
		}

		
		long end = System.currentTimeMillis();
		System.out.println(end);
		

	}

}
