package day0522.operator;

public class PonitTest04 {
	public static void main(String[] args) {

		/*
		 * 증강연산자 ++ -- int a =5; int b = ++a; ++이 변수이름 앞에 있을때 위의 int b = ++a; 의 실행은 1)
		 * a= a+1; <- 이것이 먼저 실행됨 인식됨 2) int b = a; 가되어 이후 쭉 a 는 a+1로 바뀌어 실행됨 전의 a가 a+1
		 * 값으로 대처됨
		 * 
		 * int a =5; int b = a++;
		 * 
		 * ++이 변수 이름 뒤에 있을때 int b = a++; 이것의 실행은 1)) int b = a; <-이게 먼저 실행된다 2)) a= a+1;
		 * 임
		 * 
		 * ++ --는 두단계로 실행한다고 보고 숫자 앞뒤 어디에 오냐의 따라 실행 순서가 달라지는거임!! 중요 헷갈림
		 */
		{
			int a = 5;
			int b = ++a;
			System.out.println(a);
			System.out.println(b);
			System.out.println(a);
			System.out.println();
		}

		{
			int a = 5;
			int b = a++;
			System.out.println(a);
			System.out.println(b);
			System.out.println(a);
			System.out.println(b);
			System.out.println();

		}

		{
			int a = 5;
			/*
			 * 두가지 의미가 있음 a=a+1; System.out.println(a);
			 * 
			 * System.out.println(a); a=a+1;
			 */
			System.out.println(a++);

			System.out.println(a);

			System.out.println(a++);
			System.out.println();
		}

	}

}
