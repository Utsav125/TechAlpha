package com.mycompany.techalpha;
import java.util.HashSet;
public class RemoveDuplicate {
    public static void main(String[] args) {
        int a[]={1,2,2,3,3,4,5};  
            HashSet<Integer> hs=new HashSet<>();
        for(int j:a)
        {
            hs.add(j);
        }
        System.out.print(hs+" ");
    }
}
