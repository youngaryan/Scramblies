/**
 * scra
 */
public class scra {

    public static void main(String[] args) {
        
    }
    public static boolean scramble(String str1, String str2) {
        int[] frequencyArray = new int[26]; // assume only lowercase letters are used
        for (char c : str1.toCharArray()) {
            frequencyArray[c - 'a']++;
        }
        for (char c : str2.toCharArray()) {
            int index = c - 'a';
            if (frequencyArray[index] == 0) {
                return false;
            }
            frequencyArray[index]--;
        }
        return true;
    }
    
        
    // public static boolean scramble(String str1, String str2) { 
    //     boolean result = false;
    //     int count = 0;
    //     for (int i = 0; i < str1.length(); i++) {
    //         for (int j = 0; j < str2.length(); j++) {
    //             if (str1.charAt(i) == str2.charAt(j)) {
    //                 count +=1;
    //             }
    //         }
            
    //     }

    //     if (count == str2.length()) {
    //         result = true;
    //     } else {
    //         result = false;
    //     }
        
    //     return result;
    // }
}