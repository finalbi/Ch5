import java.util.*;
public class Fermat {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,n;
		System.out.print("Enter a: ");
		a = scan.nextInt();
		System.out.print("Enter b: ");
		b = scan.nextInt();
		System.out.print("Enter c: ");
		c = scan.nextInt();
		System.out.print("Enter n: ");
		n = scan.nextInt();
		if (test(a,b,c,n) == true) {
			System.out.println("Holy smokes, Fermat was wrong!");
		}
		else {
			System.out.println("No, that doesn’t work.");
		}
	}
	
	public static boolean test(int a, int b, int c, int n) {
		return Math.pow(a, n) + Math.pow(b,n) == Math.pow(c,n) && n > 2; 
	}
}
