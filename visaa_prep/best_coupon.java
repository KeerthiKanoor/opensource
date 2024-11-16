import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        double d1=0.1*x;
        int d2=100;
       
        double max_disc=Math.max(d1,d2);
        double amount_to_pay=x-max_disc;
        System.out.println((int)amount_to_pay);
       
    }
}
