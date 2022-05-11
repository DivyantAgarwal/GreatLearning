import java.util.Scanner;

// adding one line comment

public class SwitchDemo{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter a number between 0 to 2");
		int num = in.nextInt();
		switch(num){
			case 0:System.out.println("Sunday");break;
			case 1:System.out.println("Monday");break;
			default : System.out.println("Not a valid num");
		}

	}
}