//: Sandwich.java
// Order of constructor calls

package chapter7;

class Meal{
	Meal(){
		System.out.println("Meal.constructor");
	}
}

class Bread{
	Bread(){
		System.out.println("Bread.constructor");;
	}
}

class Cheese{
	Cheese(){
		System.out.println("Cheese.constructor");
	}
}

class Lettuce{
	Lettuce(){
		System.out.println("Lettuce.constructor");
	}
}

class Lunch extends Meal{
	Lunch(){
		System.out.println("Lunch.constructor");
	}
}

class PortableLunch extends Lunch{
	PortableLunch(){
		System.out.println("PortableLunch.constructor");
	}
}

class Sandwich extends PortableLunch{
	Bread b = new Bread();
	Cheese ch = new Cheese();
	Lettuce l = new Lettuce();
	
	Sandwich(){
		System.out.println("Sandwich.constructor");
	}
	
	public static void main(String[] args){
		new Sandwich();
	}
}
