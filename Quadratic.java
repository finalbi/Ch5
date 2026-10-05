import java.util.*;
public class Quadratic {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		int a,b,c;
		System.out.print("Enter a: ");
		a = scan.nextInt();
		System.out.print("Enter b: ");
		b = scan.nextInt();
		System.out.print("Enter c: ");
		c = scan.nextInt();
		int discriminant = (int)Math.pow(b,2) - 4*a*c;
		boolean imaginary = false;
		String root1;
		String root2;
		if (a == 0) {
			System.out.println("Not a Quadratic!!!");
			return;
		}
		if (discriminant < 0) {
			discriminant = Math.abs(discriminant);
			System.out.println("root 1 is: " + -b/2*a + " + " + Math.sqrt(discriminant)/(2*a) + "i");
			System.out.println("root 1 is: " + -b/2*a + " - " + Math.sqrt(discriminant)/(2*a) + "i");
			return;
		}
		System.out.println("root 1 is: " + (-b/(2*a) + Math.sqrt(discriminant)/(2*a)));
		System.out.println("root 1 is: " + (-b/(2*a) - Math.sqrt(discriminant)/(2*a)));
		return;
	}
}
