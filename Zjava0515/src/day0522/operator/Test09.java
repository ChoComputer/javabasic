package day0522.operator;
import java.util.Scanner;
public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("이름 나이 이메일: ");
		String name = sc.next();
		int age = sc.nextInt(); //netxInt  대문자 i 잊지말기!
		String email = sc.next();
	
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("이메일 : "+email);
		
		
	}

}
