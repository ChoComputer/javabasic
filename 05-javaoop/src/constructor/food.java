package constructor;

public class food {
	
	public String store;
	public String name;
	public String type;
	public boolean flavor;
	public String owner;
	public food (String s,String n, String t, boolean f,String o) {
		
		store=s;
		name=n;
		type=t;
		flavor=f;
		owner = o;
		//System.out.println("가게 이름 : "+s+"\n음식 이름 : "+n+"\n종류 : "+t+"\n맛 : "+f+"\n");
		
	}public void getInfo() {
		System.out.println("가게 이름: " + store);
		System.out.println("음식 이름: " + name);
		System.out.println("종류 : " + type);
		System.out.println("맛: " + flavor);
		System.out.println("주인장: " + owner+"\n");
	}

	
}
