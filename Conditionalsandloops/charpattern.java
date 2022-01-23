

class charpattern{
    public static void main(String[] args)
    {
      
        for(char c = 'A' ; c<='D' ; c++)
        {
            for(int y = 0 ; y<4 ; y++){
                System.out.print((char)(c+y));
            }
            System.out.println();
        }

       
    }
}
