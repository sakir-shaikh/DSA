package TwoPointers;

class ValidPalindrom {
    public boolean isPalindrome(String s) {
        if(s == null || s.isEmpty()) return true;
        int right = s.length() - 1;
        int left = 0;
        while (left < right) {
            char lc = s.charAt(left);
            char rc = s.charAt(right);
            if(!Character.isLetterOrDigit(lc)){
                left++;
            }
            else if(!Character.isLetterOrDigit(rc)){
                right--;
            }
            else{
                if(Character.toLowerCase(lc) != Character.toLowerCase(rc)){
                    return false;
                }
                left++;
                right--;
            }
        }
        return true;
    }
}

//main class
public class PalindromeTest {
    public static void main(String[] args) {
        ValidPalindrom vp = new ValidPalindrom();
        String s = "A man, a plan, a canal: Panama";
        System.out.println(vp.isPalindrome(s)); // Output: true
    }
}
