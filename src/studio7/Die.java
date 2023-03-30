package studio7;

public class Die {
	//instance variable
	private int sides;
	private int roll;
	
	//constructor
	public Die (int a) {
		sides = a;
		setRoll();
	}
	
	public int getSides() {
		return sides;//return type but no parameter, set has parameter but no return
		
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll() {
		roll = (int)(Math.random()*(sides - 1) + 1);
	}
	public void setSides(int n) {
		sides = n; 
	}
	
	

	public static void main(String[] args) {
		Die timmy = new Die(5);
		System.out.println (timmy.getRoll());
		
		
	

	}

}
