package ArrayList;

import java.util.*;

public class rotatedPairSum {
    
    public static boolean PairSum(ArrayList<Integer> list , int target){

        int bp = -1; //breaking point to set lp and rp
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) > list.get(i+1)){
                bp = i;
                break;
            }
        }

        int lp = bp+1;
        int rp = bp;
        while(lp != rp){  //won't use lp<rp as this time lp and rp is moving in rotation
            if(list.get(lp)+list.get(rp) == target){
                return true;
            } else if(list.get(lp)+list.get(rp) < target){
                lp = (lp+1)%list.size();
            } else{
                rp = (list.size()+rp-1)%list.size();
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);
        int target = 16;

        System.out.println("Target available : " +PairSum(list, target));
    }
}
