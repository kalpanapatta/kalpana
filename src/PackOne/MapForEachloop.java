package PackOne;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapForEachloop {
    // Main driver method
    public static void main(String[] args) {
        Map<String, String> NameAddress=new HashMap();
        NameAddress.put("haritha", "guntoor");
        NameAddress.put("jyo", "parvathipuram");
        NameAddress.put("gowri", "vizayanagaram");
        NameAddress.put("kalpana", "srikakulam");
        //here we using for loop
        Set<Map.Entry<String, String>> entries =NameAddress .entrySet();
        for (Map.Entry<String, String> set=NameAddress.entrySet()) {
            System.out.println(set.getKey() + " = "
                    + set.getValue());
        }
    }
}