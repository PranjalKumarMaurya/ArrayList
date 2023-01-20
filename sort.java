package ArrayList;

import java.util.*;

public class sort {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.print("Enter the elements : ");
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

        sc.close();
    }

}
