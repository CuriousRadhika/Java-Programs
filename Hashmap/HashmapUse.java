import java.util.HashMap;

public class HashmapUse {
   
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        //insert
        map.put("abc", 1);
        map.put("def", 2);
        System.out.println(map.size());

        //check if mao contains value or not
        if(map.containsKey("abc"))
        {
            System.out.println("Has abc");
        }
        if(map.containsKey("abc1"))
        {
            System.out.println("Has abc1");
        }

        //get value
        // int v = map.get("abc");
        // System.out.println(v);
        int v=0;
        if(map.containsKey("abc"))
        {
            v = map.get("abc");
       
        }
        System.out.println(v);

         v=0;
        if(map.containsKey("abc1"))
        {
            v = map.get("abc1");
       
        }
        System.out.println(v);

        //remove
        int s = map.remove("abc");
        System.out.println(s);

        if(map.containsValue(2))
        {
            System.out.println("Has 2 as value");
        }

        

    }
                        
}              
