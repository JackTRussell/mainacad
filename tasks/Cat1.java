package tasks;

public class Cat1 {

	 public static class Cat{
		 static int catCount;
		 public Cat(){
	            Cat.catCount++;
	        }
	    }
	
	public static void main(String[] args) {
		for (int i=0; i < 4;i++){
            new Cat();
        }
		System.out.println(Cat.catCount);
		}

	}

