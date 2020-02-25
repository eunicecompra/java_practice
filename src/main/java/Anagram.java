import java.util.Scanner;

public class Anagram {

    static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) {
            return false;
        }

        String b_lowercase = b.toLowerCase();
        for(char c: a.toLowerCase().toCharArray()) {
            b_lowercase = b_lowercase.replaceFirst(""+c, "");
        }
        return b_lowercase.isEmpty();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
