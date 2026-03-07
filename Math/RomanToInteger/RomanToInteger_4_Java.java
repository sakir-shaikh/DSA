class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] arr = s.toCharArray();
        int current = 0;
        if (arr.length == 1) {
            current += map.get(arr[0]);
            return current;
        }
        int i = 0;
        while (i < arr.length - 1) {
            if (map.get(arr[i]) >= map.get(arr[i + 1])) {
                current += map.get(arr[i]);
                i++;
            } else {
                current += (map.get(arr[i + 1]) - map.get(arr[i]));
                i += 2;
            }
        }
        if (i < arr.length) {
            current += map.get(arr[arr.length - 1]) > map.get(arr[arr.length - 2])
                    ? (map.get(arr[arr.length - 1]) - map.get(arr[arr.length - 2]))
                    : map.get(arr[arr.length - 1]);
        }
        return current;

    }
}