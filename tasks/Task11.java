package tasks;

public class Task11 {

	/**
	 * @param args
	 * @return 
	 */
	public static double closest(double m, double n){
		double dif1 = 10 - m;
		double dif2 = 10 - n;
		if(dif1<dif2){
			return m;
		}else{
			return n;
		}
	}
	public static void main(String[] args) {
		System.out.println(closest(8.5, 11.45));

	}

}
