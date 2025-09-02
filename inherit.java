package java5u1;

class teacher{
	String name;
	public void data() {
		System.out.println("Java course");
	}
}
class student extends teacher
{
	String rollno;
}
public class inherit{

	public static void main(String[] args) {
	
		teacher T=new teacher();
		student S=new student();
		T.name="sangeetha";
		S.rollno="123";
		S.name="raju";
		S.data();
		System.out.println("Teacher name: "+T.name);
		System.out.println("Student name: "+S.name);
		System.out.println("student roll no:" + S.rollno);
	}
}



