package java5u1;
class GP {
	GP()
	{
		
		System.out.println("gp class");
	}
}
class P extends GP {
	P()
	{
		super();
		System.out.println("p class");
	}
}

class C extends P {
	
	C()
	{
		super();
		System.out.println("c class");
	}
}

public class superkeyword {
	public static void main(String[] args) {
	C c1=new C();	
	//P p1=new P();
	
	}

}
//parameter passing using overriding, pass an argument method is overiden
