import java.util.*;
public class Triangle {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c;
		System.out.print("Enter a: ");
		a = scan.nextInt();
		System.out.print("Enter b: ");
		b = scan.nextInt();
		System.out.print("Enter c: ");
		c = scan.nextInt();
		if (test(a,b,c) == true) {
			System.out.println("YOU CAN MAKE A TRIANGLE!!!!!");
		}
		else {
			System.out.println("You cannot make a triangle");
		}
	}
	
	public static boolean test(int a, int b, int c) {
		return a + b >= c && b + c >= a && a + c >= b; 
	}
}
