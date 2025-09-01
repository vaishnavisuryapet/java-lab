package programs;

class parametarized_constructors{
    String Name;
    String section;
    int classRoomNo;
    parametarized_constructosr(){
        System.out.println("Default Constructor"); // Default constructor with no parameters
    }
    parametarized_constructors(String Name){
            System.out.println("good morning "+ Name); // One parameterized constructor
    }
    parametarized_constructors(String Name,String section){
        System.out.println("Hii "+Name + " Welcome to "+section); // Two parameterized constructor
        
    }
    parametarized_constructors(String Name,String section,int classRoomNo){
        System.out.println("hello "+Name +"Welcome to"+ section +  " Your Class Room No: "+classRoomNo); // Three parameterized constructor
        
    }
}

public class Para{

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        parametarized_constructors par = new parametarized_constructors("");  //no parameters
        parametarized_constructors par1 = new parametarized_constructors("vaishu");
        parametarized_constructors par2 = new parametarized_constructors("vaishu","CSE_E");//two parameters
        parametarized_constructors par3 = new parametarized_constructors("vaishu","CSE_E",207);//three parameters
    }
}

