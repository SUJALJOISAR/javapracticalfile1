/*Given two non-negative int values, return true if they have the same last digit, such as with 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.

lastDigit(7, 17) → true lastDigit(6, 17) → false lastDigit(3, 113) → true
Ans.*/
Import java.util.Scanner;
class HelloWorld {
    static boolean convert(int s,int h)
        {
            int a,b;
            a=s%10;
            b=h%10;
            if(a==b)
            return true;
            else
            return false;
        }
    public static void main(String[] args) {
        
        
        int  s,h;
        Scanner sc= new Scanner(System.in);
        s= sc.nextInt();
        h=sc.nextInt();
        boolean l=convert(s,h);
        System.out.print(l);
        //System.out.print(s[2]);
        
        
    }
}
