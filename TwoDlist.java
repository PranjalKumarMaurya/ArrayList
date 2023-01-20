package ArrayList;

import java.util.*;

public class TwoDlist {
    
    public static void main(String[] args) {
        
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        
        for(int i = 1; i <= 5; i++){
            list.add(i);
            list2.add(i*2);
            list3.add(i*3);
        }

        mainList.add(list);
        mainList.add(list2);
        mainList.add(list3);

        for(int i = 0; i < mainList.size(); i++){
            ArrayList<Integer> currList = mainList.get(i);
            System.out.print("List "+ (i+1) + " is : ");
            for(int j = 0; j < currList.size(); j++){
                System.out.print(currList.get(j)+ " ");
            } 
            System.out.println();
        }

        System.out.println("Main List : " +mainList);
    }
}
