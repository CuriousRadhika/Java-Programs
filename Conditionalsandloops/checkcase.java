import java.util.Scanner;

class checkcase{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        char c = sc.nextLine().charAt(0);

        if(Character.isUpperCase(c))
        System.out.println("Uppercase");
        
        else if(c>=97 && c<=122)
        System.out.println("Lowercase");

        else
        System.out.println("Special character");

        System.out.println(Character.isUpperCase(c));
    }
        
}
