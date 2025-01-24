import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		Scanner console = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter three numbers: ");
			int a = console.nextInt();
			int b = console.nextInt();
			int c = console.nextInt();
			System.out.println("Sum: " + (a+b+c));
		}
		catch(Exception ex) {
			System.out.println("Must enter only numeric values!");
		}
		finally {
			System.out.println("This line will always run.");
		}
		
		System.out.println("Done...");

		
		console.close();
	}

}
