public class Player{
	
	private String name;
	private int health;
	private int level;
	private int experience;
	
	public Player(){
		this.name = "Mace Windu";
		this.health = 0;
		this.level = 0;
		this.experience = 0;
	}
	
	public Player(String name, int health, int level, int experience){
		this.name = name;
		this.health = health;
		this.level = level;
		this.experience = experience;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getHealth(){
		return health;
	}
	
	public void decreaseHealth(int damage){
		if(damage <= 0){
			return;
		}
		
		this.health -= damage;
	}
	
	
	public int getLevel(){
		return level;
	}
	
	public int getExperience(){
		return experience;
	}
	
	public void addExperience(int exp){
		if(exp <= 0){
			return;
		}
		
		experience += exp;
		
		if(experience % 1000 == 0){
			level++;
		}
	}	
}