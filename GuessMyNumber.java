import java.util.*;
public class GuessMyNumber {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Random random = new Random();
		int attempts = 1;
		int num = random.nextInt(100);
		System.out.println("I am thinking of a number between 1 and 100 (including both). What number am I thinking of?");
		System.out.print("Type a number: ");
		int guess = scan.nextInt();
		while (attempts != 3) {
			if (guess  > num) System.out.println("Your guess was too high");
			else if (guess < num) System.out.println("Your guess was too low");
			else break;
			System.out.print("Type a number: ");
			guess = scan.nextInt();
			attempts++;
		}
		if (attempts == 3) {
			System.out.println("You Lose, The Number Was " + num);
			return;
		}
		System.out.println("YOU WIN!!!");
	}
}
