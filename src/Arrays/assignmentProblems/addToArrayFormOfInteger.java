package Intro_array_12_dsa_kunal.practise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class addToArrayFormOfInteger {
    public static void main(String[] args) {
        int [] num = {9,9,9,9,9,9,9,9,9};
        int k = 1;
        int sum=0;

        for(int i: num){
            sum=sum*10+i;
        }
        sum=sum+k;
        List<Integer> list = new ArrayList();

        while(sum>0){
            list.add(0,sum%10);
            sum=sum/10;
        }
        System.out.println(list);
    }
}
