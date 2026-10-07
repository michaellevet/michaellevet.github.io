public class VariablesDemo{
   
    public static void main(String[] args){
	int x = 3;
	int y = 4;
	   
	x = x + y;
	System.out.printf("x = %d, y = %d\n", x, y);
	   
	y *= 5;
	System.out.printf("x = %d, y = %d\n", x, y);
	   
	x -= 1;
	System.out.printf("x = %d, y = %d\n", x, y);
	   
	y /= x;
	System.out.printf("x = %d, y = %d\n", x, y);
    }
}