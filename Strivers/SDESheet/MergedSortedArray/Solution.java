class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int first = 0;
        int last = 0;
        int[] result = new int[m + n];
        int current = 0;
        while (first < m && last < n) {
            if (nums1[first] > nums2[last]) {
                result[current] = nums2[last];
                current++;
                last++;
            } else {
                result[current] = nums1[first];
                current++;
                first++;
            }
        }
        while (last < n) {
            result[current] = nums2[last];
            current++;
            last++;
        }
        while (first < m) {
            result[current] = nums1[first];
            current++;
            first++;
        }
        for(int i=0; i<result.length; i++){
            nums1[i]= result[i];
        }
    }
}


