package PackOne;

import java.util.LinkedList;

public class LinkedListAddElements {
    public static void main(String[]Args){
        LinkedList<String>family=new LinkedList<>();
        family.add("pavan kumar");
        family.add("gopal");
        family.add("maimuna");
        family.add("susmitha");
        System.out.println("after invoking add(Ee)method"+family);
        //adding an element at the specific position
         family.add(3,"kavitha");
         System.out.println("after invoking add(int index,E element)method:"+family);
         LinkedList<String>II=new LinkedList<>();
         II.add("kalpana");
         II.add("shasi");
         //adding II elements in 1st family
        family.addAll(II);
        System.out.println("after invoking add all(collection<?extends E>c method)"+family);
    }

}
