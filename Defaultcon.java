package programs;

import program.Defaultcon;

public class Defaultcon {

	String first_name = "sri";
    String last_name = "devi";
    int age = 20;
    
    Defaultcon(){
    System.out.println("default constructor");
    }
  public static void main(String[] args) {
      
	  Defaultcon Obj = new Defaultcon();
       System.out.println("Name: " + Obj.first_name + " " + Obj.last_name);
       System.out.println("Age: " + Obj.age);
  }




}


