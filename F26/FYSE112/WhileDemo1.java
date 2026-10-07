import javax.swing.JOptionPane;

public class WhileDemo1{
   
    public static void main(String[] args){
	boolean playAgain = true;
	while(playAgain){
		String input = JOptionPane.showInputDialog(null, 
			"Enter 0 to Play Again or 1 to Quit.");
			
		int response = Integer.parseInt(input);
		playAgain = (response == 0);
	}
    }
}