package tasks;

public class Task9 {

	/**
	 * @param args
	 */
	public static int min(int a, int b) {
        if (a<b){
        	return a;
        } else {
        	return b;
        }
    }

	public static void main(String[] args) throws Exception {
        System.out.println(min(12, 33));
        System.out.println(min(-20, 0));
        System.out.println(min(-10, -20));


	}

}
