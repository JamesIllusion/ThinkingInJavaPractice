//: CADSystem.java
// Ensuring proper cleanup

package chapter6;

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

class Triangle extends Shape{
	Triangle(int i){
		super(i);
		System.out.println("Drawing a Triangle");
	}
	
	void cleanup(){
		System.out.println("Erasing a triangle");
		super.cleanup();
	}
}

class Line extends Shape{
	private int start, end;
	Line(int start, int end){
		super(start);
		this.start = start;
		this.end = end;
		System.out.println("Drawing a line: " + start + "," + end);
	}
	
	void cleanup(){
		System.out.println("Erasing a line: " + start + ", " + end);
		super.cleanup();
	}
}

public class CADSystem extends Shape{
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[10];
	
	CADSystem(int i){
		super(i+1);
		for(int j=0; j<lines.length; j++)
			lines[j] = new Line(j, j+1);
		c = new Circle(1);
		t = new Triangle(2);
		System.out.println("Combined constructor");
	}
	
	void cleanup(){
		System.out.println("CADSystem.cleanup");
		t.cleanup();
		c.cleanup();
		for(int i=0; i<10; i++)
			lines[i].cleanup();
		super.cleanup();
	}
	
	public static void main(String[] args){
		CADSystem x = new CADSystem(45);
		try{
			
		}finally{
			x.cleanup();
		}
	}
}