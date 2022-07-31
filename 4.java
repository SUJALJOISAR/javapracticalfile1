/*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.
array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
Ans.*/
import java.util.Scanner;
class HelloWorld {
    static String convert(int s,int h)
        {
            int a,b;
            a=s%10;
            b=h%10;
            if(a==b)
            return "true";
            else
            return "false";
        }
    public static void main(String[] args) {
        
        
        int  s,h;
        Scanner sc= new Scanner(System.in);
        s= sc.nextInt();
        h=sc.nextInt();
        String l=convert(s,h);
        System.out.print(l);
        //System.out.print(s[2]);
        
        
    }
}
