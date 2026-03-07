class Solution {
    public String reverseWords(String s) {
        s = s.trim();
        String [] arr = s.split("\\s+");
        int start = 0;
        int last = arr.length -1;
        while(last > start){
            String temp = arr[start];
            arr[start] = arr[last];
            arr[last] = temp;
            start++;
            last--;
        }
        return String.join(" ", arr);

    }
}