package astructure.oldCtype;

public class Structure02 {

	// person 내부의 정보를 ㅅ휩게 조회하기 위한 메서드 제작
	public static void getInfo(Person p) {
		System.out.println(p.name);
		System.out.println(p.age);
		System.out.println(p.pNum);
		System.out.println(p.address);
	}

	public static void catgetInfo(Cat z) {

		System.out.println("고양이 이름 : " + z.name);
		System.out.println("고양이 나이 : " + z.age);
		System.out.println("고양이 품종 : " + z.type);
	}

	public static void main(String[] args) {
		// 임의의 사람 두명 만들기 (a,b)

		Person a = new Person();

		a.name = "홍홍동";
		a.age = 20;
		a.pNum = "010-000-0000";
		a.address = "seoul";

		Person b = new Person();

		b.name = "길길동";
		b.age = 30;
		b.pNum = "010-111-1111";
		
		getInfo(a);
		getInfo(b);
		// 한번에 표시 Sys~ X3 안해도됨

		Cat c = new Cat();

		c.name = "냥냥이";
		c.age = 3;
		c.type = "bbbt";

		Cat d = new Cat();

		d.name = "솜솜이";
		d.age = 1;
		d.type = "aaa";

		catgetInfo(c);
		catgetInfo(d);

		//이렇게 person cat class 파일을 따로 만들고 내용을 또 만들어서 두개를 만드는건 c언어시절
	}

}
