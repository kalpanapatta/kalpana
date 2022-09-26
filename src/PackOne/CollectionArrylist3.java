package PackOne;

import java.util.ArrayList;

public class CollectionArrylist3 {
    public static void main(String[]Args){
        ArrayList<Integer> salary=new ArrayList();
        salary.add(10000);
        salary.add(15000);
        salary.add(18000);
        salary.add(null);
        salary.add(15000);
        salary.add(20000);
        salary.add(3456);
        //using while loop
        int val=0;
        while (salary.size() > val) {

            System.out.println(salary.get(val));
            val++ ;

        }




    }
}
