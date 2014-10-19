//Polymorphism in Java

class Shape_{
	void draw(){
		
	}
	
	void erase(){
		
	}
}

class Circle_ extends Shape_{
	void draw(){
		System.out.println("Circle.draw");
	}
	
	void erase(){
		System.out.println("Circle.erser");
	}
}

class Square_ extends Shape_{
	void draw(){
		System.out.println("Square.draw");
	}
	
	void erase(){
		System.out.println("Square.erase");
	}
}

class Triangle_ extends Shape_{
	void draw(){
		System.out.println("Triangle.draw");
	}
	
	void erase(){
		System.out.println("Triangle.erase");
	}
}

public class Shapes {
	public static Shape_ randShape(){
		switch ((int)(Math.random()*3)){
			default:
			case 0: return new Circle_();
			case 1: return new Square_();
			case 2: return new Triangle_();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape_[] s = new Shape_[9];
		
		for(int i=0; i<s.length; i++){
			s[i] = randShape();
		}
		
		for(int j=0; j<s.length; j++){
			s[j].draw();
		}

	}

}
