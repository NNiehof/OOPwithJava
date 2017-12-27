
import java.util.HashMap;
import java.util.Map;

public class Nicknames {

    public static void main(String[] args) {
        // Store people's names and nicknames in a hashmap
        HashMap<String, String> names = new HashMap<String, String>();
        names.put("matti", "mage");
        names.put("mikael", "mixu");
        names.put("arto", "arppa");
        
        System.out.println(names.get("mikael"));
    }

}
