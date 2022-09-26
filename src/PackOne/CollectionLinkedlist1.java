package PackOne;

import java.util.Iterator;
import java.util.LinkedList;

public class CollectionLinkedlist1 {
    public static void main(String[]args){
        LinkedList<String>days=new LinkedList<>();
        days.add("sunday");
        days.add("sunday");
        days.add("monday");
        days.add("tuesday");
        days.add("null");
        days.add("wednesday");
        days.add("friday");
        days.add("saturday");
        days.add("null");
        days.add("null");
        //using literator loop
          Iterator itr= days.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());


        }



    }
}
