import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char vignesh=sc.next().charAt(0);
        char charan=sc.next().charAt(0);
        
        if(vignesh==charan)
        {
            System.out.println("NULL");
        }
        else if((vignesh=='R'&&charan=='S')||(vignesh=='S'&&charan=='P')||(vignesh=='P'&&charan=='R'))
        {
            System.out.println("Vignesh");
        }
        else{
             System.out.println("Charan");
        }
    }
}
