/*Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.
stringMatch("xxcaazz", "xxbaaz") → 3 stringMatch("abc", "abc") → 2 stringMatch("abc", "axc") → 0
Ans.*/
public class prac5 {
    public int string(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length() - 1; i++) {
            String a1 = a.substring(i, i + 2);
            String b1 = b.substring(i, i + 2);
            if (a1.equals(b1))
                count++;
        }
        return count;

    }

    public static void main(String[] args) {
        prac5 p5 = new prac5();
        // p5.stringMatch("xxcaazz", "xxaaz");
        System.out.println(p5.string("abc", "abc"));
    }
}
