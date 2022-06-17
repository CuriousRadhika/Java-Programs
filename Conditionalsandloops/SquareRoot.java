class SquareRoot {
     
   
    static int Sqrt(int x)
    {
       
        if (x == 0 || x == 1)
            return x;
 
      
        int i = 1, result = 1;
         
        while (result <= x) {
            i++;
            result = i * i;
        }
        System.out.println(result);
        return i - 1;
    }
 
    
    public static void main(String[] args)
    {
        int x = 25;
        System.out.print(Sqrt(x));
    }
}
 