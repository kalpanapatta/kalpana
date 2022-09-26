package PackOne;

import java.util.LinkedList;

public class CollectionLinkedlist2 {
    public static void main(String[]Args){
        LinkedList<String>name=new LinkedList<>();
        name.add("kesava");
        name.add("ramesh");
        name.add(null);
        name.add("kesava");
        name.add("preethi");
        name.add(null);
        name.add("apple");
        //using for loop
        for(int i=0;i<name.size();i++) {
            //hera we use int i=0 is index staring and i<name.size is knowing about size of index
            System.out.println(i);
        }

    }
}
