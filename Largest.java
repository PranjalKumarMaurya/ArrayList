package ArrayList;

import java.util.ArrayList;

public class Largest {
    
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(56);
        list.add(34);
        list.add(69);
        list.add(420);

        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < list.size(); i++){
            // if(largest < list.get(i)){
            //     largest = list.get(i);
            // }
            largest = Math.max(largest, list.get(i));
        }

        System.out.println("Largest number is "+largest);
    }
}
