package java5u1;
class Shape{
	int a,b;
	void PrintArea()
	{
		
	}
}

class rectangle extends Shape {
	rectangle(int length, int breadth){
	a=length;
    b=breadth;
	}
    void PrintArea()
    {
    	System.out.println("area of rect: "+a*b);
    }
}
class circle extends Shape {
	circle(int radius){
	a=radius;
	}
	void PrintArea()
	{
		System.out.println("circle: "+(3.14*a*a));
	}
	
}
class triangle extends Shape {
	triangle(int len,int hei){
	a=len;
	b=hei;
	}
	void PrintArea()
	{
		System.out.println("triangle: "+0.5*a*b);
	}
}
public class Abstract_class {
	public static void main(String[] args) {
	Shape r=new rectangle(3,4);
	Shape c=new circle(5);
	Shape t=new triangle(6,4);
    r.PrintArea();
    c.PrintArea();
    t.PrintArea();
}
}
