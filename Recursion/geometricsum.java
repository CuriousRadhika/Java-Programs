import java.util.Scanner;
public class geometricsum {
    public static double geosum(int k)
    {
        if(k==0)
        return 1 ;

        double sum= 1/Math.pow(2,k) + geosum(k-1);
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
      
        System.out.println(geosum(k));
    }
}
