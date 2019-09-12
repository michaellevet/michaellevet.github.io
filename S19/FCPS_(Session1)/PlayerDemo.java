public class PlayerDemo{
	
	public static void main(String[] args){
		Player player = new Player("Yoda", 100, 1, 0);
		
		for(int i = 0; i < 5; i++){
			player.addExperience(200);
			System.out.println("Player Level: " + player.getLevel());
		}
		
		player.decreaseHealth(30);
		System.out.println("Player Health: " + player.getHealth());
	}
}