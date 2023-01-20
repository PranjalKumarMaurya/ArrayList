package ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {
        
        ArrayList<Integer> FirstList = new ArrayList<>();

        //add 
        FirstList.add(1);
        FirstList.add(2);
        FirstList.add(3);
        FirstList.add(4);
        FirstList.add(5);
        System.out.println(FirstList);

        //to add in between
        // FirstList.add(1, 7);
        // System.out.println(FirstList);

        //get element 
        // int element = FirstList.get(2);
        // System.out.println(element);

        //remove element
        // FirstList.remove(2);
        // System.out.println(FirstList);

        //set element 
        // FirstList.set(2,10);
        // System.out.println(FirstList);

        //contains check
        // System.out.println(FirstList.contains(2));
        // System.out.println(FirstList.contains(11));

        //size and iteration
        // System.out.println(FirstList.size());
        // for(int i = 0; i < FirstList.size(); i++){
        //     System.out.print(FirstList.get(i)+" ");
        // }
        // System.out.println();

        //reverse of array list
        for(int i = FirstList.size()-1; i >= 0; i--){
            System.out.print(FirstList.get(i)+" ");
        }System.out.println();
    }
}
