
public class Bird extends Animal implements IFly,ISpeak {
	@Override
	public void canfly() {
		System.out.println("I am flying");
	}
	@Override
	public void sing() {
		System.out.println("I am Singing");
	}
	
}
