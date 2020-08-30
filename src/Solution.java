
public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A.1
		Bird bird = new Bird();
		bird.walk();
		bird.fly();
		bird.sing();
		//A.2
		Bird obj = new Chicken();
		obj.fly();
		obj.sing();
		Bird objduck = new Duck();
		objduck.fly();
		objduck.sing();
		//A.3
		Bird objrooster = new Rooster();
		objrooster.fly();
		objrooster.sing();
		//A.4
		Bird objParrotWithCat = new ParrotLivingWithCat();
		objParrotWithCat.sing();
		Bird objParrotWithDog = new ParrotLivingWithDog();
		objParrotWithDog.sing();
		Bird objParrotWithRooster =new ParrotLivingWithRooster();
		objParrotWithRooster.sing();
		
	    //B.1
		/*
		 * Fishes objFish=new Fishes(); objFish.swim();
		 */
		
		//B.2
		Fishes objshark=new Shark();
		objshark.phsicalAppearence();
		objshark.behaviour();
		Fishes objClownFish=new ClownFish();
		objClownFish.phsicalAppearence();
		objClownFish.behaviour();
		
		//B.3
		Dolphins d= new Dolphins();
		d.swim();
		
		//C.1 
		Butterfly objButterfly=new Butterfly();
		objButterfly.canfly();
		objButterfly.sound();
	}
}
