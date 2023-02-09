import java.util.Scanner;

class outputchec{

	static int fun(int a, int b)
	{
		if((3^b)>(b+a) && (b-a)>(a&b))
		{
			a=(a+3)+a;
			b=(a+3)+b;
			b=b+2;
			return fun(a+1 , a);
		}
		b=2+a+b;
		return a-b+1;
	}
	
	public static void main(String[] args) {
		
		
		System.out.println(fun(0,5));
	}
}
