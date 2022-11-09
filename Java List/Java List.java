//Java List
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        List<Integer> l= new ArrayList<>();
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        while(n>0){
            int element=sc.nextInt();
            l.add(element);
            n--;
        }
        int q=sc.nextInt();
        while(q>0){
            String s=sc.next();
            if(s.equals("Insert")){
            int x=sc.nextInt();
            int y=sc.nextInt();
            l.add(x,y);
            }
            else{
               int x=sc.nextInt();
               l.remove(x); 
           
        }
        q--;
    }
    for(int x: l){
        System.out.print(x+" ");
    }
}
}
