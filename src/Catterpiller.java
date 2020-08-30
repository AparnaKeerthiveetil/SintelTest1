
public class Catterpiller  implements WalkIF {

	@Override
	public void walk() {
		System.out.println("I can crawl");

	}
	public Butterfly transform(Catterpiller c){
		c = null;
		return new Butterfly();
	}
}