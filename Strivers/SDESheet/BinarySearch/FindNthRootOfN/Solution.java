public class Solution {
    public static int NthRoot(int n, int m) {
      if(n == 1){return m;}
      int low=1; int mid=1; int high=m;
      while(high >= low){
            mid = (high + low)/2;

        if(m == Math.pow(mid, n)){
          return mid;
        }
        else if(m < (int)Math.pow(mid, n)){
          high = mid -1;
        }
        else{
          low = mid+1;
        }
      }
      return -1;
    }
}
