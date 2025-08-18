package GYM.Easy;

import java.io.*;
import java.util.*;

class Accio{
    public ArrayList<Integer> twoSum(int[] nums, int target) {
        int a = 0 ;
        int b = 1; 
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0 ; i<nums.length;i++){
             if(nums[a]+nums[b] == target){
                ans.add(a);
                ans.add(b);
             }
        }
        return ans;
    }
}

public class abc {

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int target = input.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }
        Accio obj = new Accio();
        ArrayList<Integer> arr = obj.twoSum(nums,target);
        System.out.print(arr.get(0));
        System.out.print(' ');
        System.out.print(arr.get(1));
    }
}