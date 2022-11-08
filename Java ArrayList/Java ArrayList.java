//Java Arraylist
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<List<Integer>> l= new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int d=sc.nextInt();
            List<Integer> temp= new ArrayList<>();
            while(d>0){
                temp.add(sc.nextInt());
                d--;
            }
            l.add(temp);            
            n--;
        }
        int q=sc.nextInt();
        
        while(q>0){
            int x=sc.nextInt();
            int y=sc.nextInt();
                     
             if(l.get(x-1).size()>y-1){
             System.out.println(l.get(x-1).get(y-1));
            }
         else{
             System.out.println("ERROR!");
         }
            q--;
        }        
    }
}