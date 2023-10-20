//check pangram or not
public class PangramChecker {
    public static void main(String[] args) {
        String input = "The quick brown fox jumps over the lazy dog"; 
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String str) {
       
        str = str.replaceAll(" ", "").toLowerCase();

        
        boolean[] lettersPresent = new boolean[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            
            if ('a' <= ch && ch <= 'z') {
                
                lettersPresent[ch - 'a'] = true;
            }
        }

        
        for (boolean isPresent : lettersPresent) {
            if (!isPresent) {
                return false; 
            }
        }

        return true; 
    }
}

