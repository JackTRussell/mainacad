package tasks;

import java.util.Scanner;

public class Task13 {

	/**
	 * @param args
	 */
	@SuppressWarnings("resource")
	public static void main(String[] args) {
    	System.out.println("Please enter 1: ");
    	Scanner sc = new Scanner (System.in);
    	int a = sc.nextInt();
    	if (a==1){
    		System.out.println("You entered 1");
    	}else{
    		System.out.println("Your number is not equal to 1");
    	}
        
	}

}
