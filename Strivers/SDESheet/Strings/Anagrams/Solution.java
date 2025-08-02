class Solution {
    public boolean isAnagram(String s, String t) {
        char s1[] = s.toCharArray();
        Arrays.sort(s1);
        s = String.valueOf(s1);
        char s2[] = t.toCharArray();
        Arrays.sort(s2);
        t = String.valueOf(s2);
        if(s.equals(t)){
            return true;
        }
        else{
            return false;
        }
        
    }
}