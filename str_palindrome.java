package java5u1;
import java.util.Scanner;
public class str_palindrome {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String a=s.next();
		StringBuilder str=new StringBuilder(a);
        str.reverse();
        String rev_str=str.toString();
        System.out.println("Rversed string is: "+rev_str);
		if(rev_str.equals(a))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("not a palindrome");
		}
		
		}
}
