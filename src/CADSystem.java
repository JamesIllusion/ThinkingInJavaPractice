import java.util.*;

class Shape{
	Shape(int i){
		System.out.println("Shape constructor");
	}

	void cleanup(){
		System.out.println("Shape cleanup");
	}
}

class Circle extends Shape{
	Circle(int i){
		super(i);
		System.out.println("Drawing a circle");
	}

	void cleanup(){
		System.out.println("Erasing a circle");
		super.cleanup();
	}
}
