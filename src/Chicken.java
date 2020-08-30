
public class Chicken extends Bird {
	
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
	
	@Override
	protected void fly() {
		System.out.println("Chicken cannot fly");
	}
	
}
