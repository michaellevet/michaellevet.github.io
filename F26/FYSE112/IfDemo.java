public class IfDemo{
   
    public static void main(String[] args){
		int grade = 64;
		
		if(grade >= 90){
			System.out.println("You earned an A");
		}
		else if(grade >= 80){
			System.out.println("You earned a B");
		}
		else if(grade >= 70){
			System.out.println("You earned a C");
		}
		else if(grade >= 60){
			System.out.println("You earned a D");
		}
		else{
			System.out.println("You earned an F");
		}
    }
}