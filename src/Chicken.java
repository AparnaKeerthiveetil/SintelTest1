
public class Chicken extends Bird {
	
	@Override
	public void sing() {
		System.out.println("Cluck, cluck");
	}
	
	@Override
	public void canfly(){
		System.out.println("Chicken cannot fly");
	}
	
}
