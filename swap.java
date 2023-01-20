package ArrayList;

import java.util.*;

public class swap {
    
    public static void Swap(ArrayList<Integer> list, int idx1, int idx2){
        int temp = list.get(idx1);
        list.set(idx1,list.get(idx2));
        list.set(idx2, temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        
        System.out.println("Enter the elements : ");
        for(int i = 0; i < 5; i++){
            list.add(sc.nextInt());
        }

        System.out.print("Enter first index to replaced : ");
        int idx1 = sc.nextInt();
        System.out.print("Enter the index to be swapped with : ");
        int idx2 = sc.nextInt();
        System.out.println(list);

        Swap(list, idx1, idx2);
        System.out.println(list);

        sc.close();
    }
}
