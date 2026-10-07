import javax.swing.JOptionPane;

public class JOptionPaneDemo{
   
    public static void main(String[] args){
		String input = JOptionPane.showInputDialog(null, "What is your name?");
		JOptionPane.showMessageDialog(null, "Hello, " + input);
    }
}