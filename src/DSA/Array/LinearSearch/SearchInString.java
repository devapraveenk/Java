package DSA.Array.LinearSearch;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Deva";
        System.out.println(Arrays.toString(str.toCharArray()));
        char target = 'a';
        System.out.println(linearSearch1(str, target));
    }
    private static boolean linearSearch1(String str, char target){

//        for (int x = 0; x < str.length(); x++) {
//            if(target == str.charAt(x)){
//                return true;
//            }
//        }

        //For Each Loop
        for(char ch: str.toCharArray()){
            if(target == ch)
                return true;
        }
        return false;
    }
}


