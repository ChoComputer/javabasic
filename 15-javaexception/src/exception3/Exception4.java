package exception3;

public class Exception4 {
	public static void main(String[] args) {
		int[] number = { 1, 2, 3, 4, 5, 0 };

		try {
			for (int i = 0; i < 6; i++) {
				System.out.println(number[i]);
			}
			System.out.println(number[4] / number[5]);
		} catch (ArrayIndexOutOfBoundsException | ArithmeticException a) {      //try ~ catch 에선 | 하나만 쓰는듯?
			System.out.println("범위를 벗어난 인덱스 번호를 입력 했거나");
			System.out.println("0으로 나눴습니다.");
		} catch (Exception e) {
			System.out.println("이외의 예외가 발생하였습니다.");
		}

	}
}
