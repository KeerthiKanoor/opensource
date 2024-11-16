import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int A=sc.nextInt();
        int B=sc.nextInt();
        int C=sc.nextInt();
        int X=sc.nextInt();
        if(A+B>=X||A+C>=X||B+C>=X)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
                     
    }
}
