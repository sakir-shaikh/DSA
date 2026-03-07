class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length <= 1){
            return new StringBuilder().append(strs[0]).toString();
        }
        Arrays.sort(strs);
        StringBuilder sb = new StringBuilder();
        String last = strs[strs.length - 1];
        String first = strs[0];
        int i =0;
        while(i < first.length()){
            if(first.charAt(i) != last.charAt(i)){
                break;
            }
            sb.append(first.charAt(i));
            i++;
        }
        return sb.toString();
    }
}