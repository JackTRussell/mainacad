package tasks;

public class Cat2 {

	public static class Cat
	{
	    String name;
	    String color = "Grey";
	    String address;
	    int weight = 4;
	    int age = 8;
		

	    public Cat(String name)
	    {
	        this.name = name;
	    }

	    public Cat(String name, int age, int weight)
	    {
	        this.name = name;
	        this.weight = weight;
	        this.age = age;
	    }

	        public Cat(int weight, String color)
	    {
	        this.weight = weight;
	        this.color = color;
	    }
	  
	
	public static void main(String[] args) {
		Cat catName = new Cat("Vaska");
        System.out.println(catName.name);
        Cat catNaw = new Cat("Murka", 6, 3);
        System.out.println(catNaw.name + ", " + catNaw.age + ", " + catNaw.weight);
        Cat catWc = new Cat(5, "Ginger");
        System.out.println(catWc.weight + ", " + catWc.color);
        }
    } 
	}

	


