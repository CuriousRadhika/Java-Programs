import java.util.Scanner;
public class ReplacePi {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String s=sc.next();
        System.out.println(s.replaceAll("pi", "3.14"));
    }

    // Java program for above approach
// class GFG {

// 	// A simple recursive approach
// 	// to replace all pi in a given
// 	// function with "3.14". Firstly
// 	// function is declared we don't
// 	// need any helper function one
// 	// function is enough
// 	public static String replacePi(String s)
// 	{

// 		// Base case if s is empty
// 		// or length of s is 1
// 		// return the s
// 		if (s.length() == 0 || s.length() == 1)
// 			return s;

// 		// If the 0th and 1st element
// 		// of s are p and i we have to
// 		// handle them for rest we have
// 		// to call recursion it will
// 		// give the result
// 		if (s.charAt(0) == 'p' && s.charAt(1) == 'i') {

// 			// Smalloutput is a variable
// 			// used to store recursion result
// 			String smallOutput = replacePi(s.substring(2));

// 			// And we have to add the recursion
// 			// result with the first part we
// 			// handled and return the answer
// 			return "3.14" + smallOutput;
// 		}
// 		else {

// 			// If not then we have to call
// 			// recursion from 1st to all elements
// 			// then add recursion result to
// 			// 1st element and return it
// 			String smallOutput = replacePi(s.substring(1));
// 			return s.charAt(0) + smallOutput;
// 		}
// 	}

// 	// Driver code
// 	public static void main(String[] args)
// 	{
// 		String s = "pipppiiipi";

// 		// Function call
// 		String result = replacePi(s);
// 		System.out.println(result);
// 	}
// }

// // This code is contributed by divyesh072019

}
