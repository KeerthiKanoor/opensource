import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int X=sc.nextInt();
        int Y=sc.nextInt();
        int Z=sc.nextInt();
        int timereq=X*Y;
        int timeavailable=Z*24*60;//24 hours, 60 minutes
        if( timereq<= timeavailable)
        
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
}
