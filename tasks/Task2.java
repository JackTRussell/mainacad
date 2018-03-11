package tasks;
import java.util.Scanner;

public class Task2 {
    @SuppressWarnings("resource")
	public static void main(String[] args) {

    	System.out.println("Enter your number: ");
    	Scanner sc = new Scanner (System.in);
    	int a = sc.nextInt();
        System.out.println(a*a);
        
    }
}
