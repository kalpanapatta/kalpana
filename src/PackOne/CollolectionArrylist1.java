package PackOne;

import java.util.ArrayList;
import java.util.Iterator;

public class CollolectionArrylist1 {
    public static void main(String[]Args){
        ArrayList<Integer> list=new ArrayList<Integer>();//creation arrylist
        list.add(2);
        list.add(4);
        list.add(5);
        list.add(5);
        list.add(null);
        list.add(3);
        //using iterator loop
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }




    }
}
