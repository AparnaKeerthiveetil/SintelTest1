import java.util.ArrayList;
import java.util.List;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A.1
		Bird bird = new Bird();
		bird.walk();
		bird.canfly();
		bird.sing();
		//A.2
		Bird obj = new Chicken();
		obj.canfly();
		obj.sing();
		Bird objduck = new Duck();
		objduck.canfly();
		objduck.sing();
		//A.3
		Bird objrooster = new Rooster();
		objrooster.canfly();
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
		
		//D.2
		//catterpiller before metamorphosis
		Catterpiller c1 =new Catterpiller();
		c1.walk();
		//After Metamorphosis
		Butterfly b2=c1.transform(c1);
		b2.canfly();
		
		//E
		
		Animal[] animals = new Animal[]{
				new Bird(),
				new Duck(),
				new Chicken(),
				new Rooster(),
				new Parrot(),
				new Fishes(),
				new Shark(),
				new ClownFish(),
				new Dolphins(),
				new Parrot(),
				new Butterfly(),
				new Catterpiller()
				};
			
		CountingAnimals objCount= new CountingAnimals(animals);
		System.out.println("Flying Animal: " + objCount.getFlyingAnimal());
		System.out.println("Speaking Animal: " + objCount.getSpeakingAnimal());
		System.out.println("Swimming Animal: " + objCount.getSwimingAnimal());
		System.out.println("Walking Animal: " + objCount.getWalkingAnimal());
		
		//Bonus.1
		
		Rooster objRooster = new Rooster();
		   List<String> arrayList = new ArrayList<String>(){{
			    add("English");
		        add("Danish");
		        add("Dutch");
		        add("Finnish");
		        add("French");
		        add("German");
		        add("Greek");
		        add("Hebrew");
		        add("Hungarian");
		        add("Italian");
		        add("Japanese");
		        add("Portuguese");
		        add("Russian");
		        add("Swedish");
		        add("Turkish");
		        add("Hindi");
			}}; 

			for (String lang : arrayList) {
				objRooster.sing(lang);
			}
	
	 
		
		
	}
}
