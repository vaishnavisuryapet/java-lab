package java5u1;

class RBIbank{
	public double getrateofinterest() {
		return 5.0;
	}
}

class Sbi extends RBIbank{
	public double getrateofinterest() {
		return 6.5;
    }
	public void Sbifeature() {
		System.out.println("zero loan");
	}
}
class ICICI extends RBIbank{
	public double getrateofinterest() {
		return 7.5;
	}
}
public class Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RBIbank rb=new RBIbank();
		Sbi sb1=new Sbi();
		ICICI ici =new ICICI();
		
        System.out.println("RBI rate of interest is"+ rb.getrateofinterest());
        System.out.println("sbi rate of interest is"+ sb1.getrateofinterest());
        System.out.println("ICICI rate of interest is"+ ici.getrateofinterest());
        sb1.Sbifeature();
	}

}
