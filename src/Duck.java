
public class Duck extends Bird implements ISwim{
	
	@Override
	public void sing() {
		System.out.println("Quack, quack");
	}

	@Override
	public void swim() {
		System.out.println("A duck can swim");
		
	}
}
