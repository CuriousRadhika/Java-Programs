
import java.util.*;
public class MaxFreqNum {
    public static void main(String[] args)
    {
        int a[] = {-1,0,0,0,1,1,0};

        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i <a.length; i++)
        {
            int v=1;
            if(map.containsKey(a[i]))
            {
                 v = map.get(a[i]);
                 v++;
            }
            map.put(a[i], v);

            // if(map.containsKey(a[i]))
            // map.put(a[i] , map.get(a[i])+1);
            // else
            // map.put(a[i] ,1);
    }
         
    Set<Integer> keys = map.keySet();
    int v = Integer.MIN_VALUE;
    int k=0;

    for(int key : keys)
    {
        if(map.get(key)>v)
        {
            v=map.get(key);
            k=key;
        }
    }
    System.out.print(k);
    }
}
