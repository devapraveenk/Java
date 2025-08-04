package ZohoProblems;
import java.util.*;

public class CheckAnagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str1 = in.nextLine();
        String str2 = in.nextLine();
        System.out.println(isAnagram(str1, str2));
    }
    private static boolean isAnagram(String str1, String str2){
        if(str1.length() != str2.length()) return false;
        int[] frequency = new int[26];
        for(char ch: str1.toCharArray())
        {
            frequency[ch - 'a']++;
        }
        for(char ch: str2.toCharArray())
            frequency[ch - 'a']--;
        for(int x = 0; x < 26; x++) {
            if (frequency[x] != 0) {
                return false;
            }

        }

        return true;
    }
}
// TC : O(n)
// SC : O(1) (because for any string we took only 26 integer memory)
