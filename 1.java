/*Given a string, return a string made of the first 2 chars (if present), however include first char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".

startOz("ozymandias") → "oz" startOz("bzoo") → "z"
startOz("oxx") → "o"
Ans.*/
import java.util.Scanner;
public class code1_oz{
    public static void main(String[] args) {
        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        char[] ch = s.toCharArray();
        if(ch[0] == 'o')
        {
            System.out.println(ch[0]);
        }
        if(ch[1] == 'z')
        {
            System.out.println(ch[1]);

        }
    }
}


