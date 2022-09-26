package PackOne;

import java.util.ArrayList;

public class CollectionArrylist2 {
    public static void main(String[]Args){
        ArrayList<String>names=new ArrayList<>();
        names.add("kalpana");
        names.add("vissu");
        names.add("janu");
        names.add("bhavi");
        names.add("thanvi");
        //using for loop
        for(int i=0;i<names.size();i++) {
            //here we use int for forloop
            System.out.println(names);
        }
    }
}
