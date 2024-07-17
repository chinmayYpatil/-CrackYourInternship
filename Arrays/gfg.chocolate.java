import java.util.ArrayList;
import java.util.Collections;


class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        Collections.sort(a);
        Long res=Long.MAX_VALUE;
        for(int i=0;i<n-m+1;i++){
            int min=a.get(i);
            int max=a.get(i+m-1);
            res=Math.min(res,max-min);
        }
        return res;
    }
}