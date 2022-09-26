package PackOne;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExampleWithEntrySet {
    public static void main(String[] args) {
        Map<String,String>map=new HashMap();
        map.put("name1","name2");
        map.put("name31","name562");
        map.put("nam21","name2655");
        map.put("name41","name2");
        //here we are using literator loop5

        Set<Map.Entry<String, String>> entries = map.entrySet();
        Iterator<Map.Entry<String, String>>ref=entries.iterator();
        while (ref.hasNext()){

            Map.Entry<String, String> keyValue = ref.next();
            System.out.println(keyValue.getKey()+"==="+keyValue.getValue());
        }



    }
}
