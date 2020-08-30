import java.util.HashMap;
import java.util.Map;

public class Rooster extends Chicken {
	private static final Map<String, String> langMapping;
    static
    {
        langMapping = new HashMap<String, String>();
        langMapping.put("English", "Cock-a-doodle-doo");
        langMapping.put("Danish", "kykyliky");
        langMapping.put("Dutch", "kukeleku");
        langMapping.put("Finnish", "kukko kiekuu");
        langMapping.put("French", "cocorico");
        langMapping.put("German", "kikeriki");
        langMapping.put("Greek", "kikiriki");
        langMapping.put("Hebrew", "coo-koo-ri-koo");
        langMapping.put("Hungarian", "kukuriku");
        langMapping.put("Italian", "chicchirichi");
        langMapping.put("Japanese", "ko-ke-kok-ko-o");
        langMapping.put("Portuguese", "cucurucu");
        langMapping.put("Russian", "kukareku");
        langMapping.put("Swedish", "kuckeliku");
        langMapping.put("Turkish", "kuk-kurri-kuuu");
        langMapping.put("Hindi", "kukudu koo");

    }
    public void sing(String language) {

	
			   System.out.println(langMapping.get(language));
		  
    }
	@Override
	public void sing() {
		System.out.println("Cock-a-doodle-doo");
	}
}
