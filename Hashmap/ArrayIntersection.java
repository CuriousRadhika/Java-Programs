import java.util.*;

public class ArrayIntersection {
    public static void main(String[] args)
    {
        int a[] = {2, 6 ,1 ,2};
        int b[] = {1, 2, 3 ,4, 2 };

        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();

        for(int i=0; i<a.length; i++)
        {
            if(map.containsKey(a[i]))
            {
                map.put(a[i], map.get(a[i]+1));
            }
            else{
                map.put(a[i], 1);
            }
        }
        for(int i=0; i<b.length; i++)
        {
            if(map.containsKey(b[i]) && map.get(b[i])>0)
            {
                map.put(b[i], map.get(b[i]-1));
                System.out.println(b[i]);
            }
        }
    }
}
