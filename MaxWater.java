package ArrayList;

import java.util.*;

public class MaxWater {
    
    //BRUTE FORCE
    // public static int MaxWaterHold(ArrayList<Integer> height){

    //     int MaxWaterHold = 0;
    //     for(int i = 0; i < height.size(); i++){
    //         for(int j = i+1; j < height.size(); j++){
    //             int ht = Math.min(height.get(i), height.get(j));
    //             int wd = j-i;
    //             int CurrWaterHold = ht*wd;
    //             MaxWaterHold = Math.max(MaxWaterHold, CurrWaterHold);
    //         }
    //     }

    //     return MaxWaterHold;
    // }

    //2-Pointeer method
    public static int MaxWaterHold(ArrayList<Integer> height){

        int MaxWater= 0;
        int lp = 0; //left pointer
        int rp = height.size()-1; //right pointer

        while(lp < rp){
            int ht = Math.min(height.get(lp), height.get(rp));
            int wd = rp-lp;
            int CurrWater = ht*wd;
            MaxWater = Math.max(MaxWater, CurrWater);
            if(height.get(lp) < height.get(rp)){
                lp++;
            } else{
                rp--;
            }
        }

        return MaxWater;
    }

    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(8);
        height.add(6);
        height.add(2);
        height.add(5);
        height.add(4);
        height.add(8);
        height.add(3);
        height.add(7);

        System.out.print("Maximum amount of water that can be hold is : " +MaxWaterHold(height));
    }
}
