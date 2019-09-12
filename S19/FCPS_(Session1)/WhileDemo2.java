import javax.swing.JOptionPane;

public class WhileDemo2{
   
    public static void main(String[] args){
	boolean playAgain = false;
	while(playAgain){
		String input = JOptionPane.showInputDialog(null, 
			"Enter 0 to Play Again or 1 to Quit.");
			
		int response = Integer.parseInt(input);
		playAgain = (response == 0);
	}
	
	do{
		String input = JOptionPane.showInputDialog(null, 
			"Enter 0 to Play Again or 1 to Quit.");
			
		int response = Integer.parseInt(input);
		playAgain = (response == 0);
	}while(playAgain);
    }
}