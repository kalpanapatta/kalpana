package PackOne;

import java.util.HashMap;
import java.util.Map;

public class MaoExample {
    public Map<String,String > getNameAndAdress(){
        Map< String,String> family =new HashMap();
        family.put("janu","Banglore");
        family.put("vissu","hydrabad");
        family.put("kalpu","vizag");
        family.put("kesava","purli");
        family.put("nirmala","arasavalli");
        return family;
    }
    public static void main(String[]Args){
        MaoExample my = new MaoExample();
        Map<String,String> dear =my.getNameAndAdress();
        System.out.println(dear);

    }


}