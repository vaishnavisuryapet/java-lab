package java5u1;
import java.util.Scanner;
public class Sumofintegers {
	public static void main(String[] args) {
			Scanner s =new Scanner(System.in);
			int i;
			int even=0,odd=0;
			for(i=0;i<=10;i++)
			{
				if(i%2==0)
				{
				even=even+i;
		        }
			}	
			for(i=1;i<=10;i++)
			{
				if(i%2!=0)
				{
				odd=odd+i;
			    }
			}	
			System.out.println("The even sum: "+even);
			System.out.println("The odd sum: "+odd);
	}
	

}
