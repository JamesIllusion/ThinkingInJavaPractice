abstract class Glyph{
	abstract void draw();
	
	Glyph(){
		System.out.println("Glyph.constructor before draw");
		draw();
		System.out.println("Glyph.constructor after draw");
	}
}

class RoundGlyph extends Glyph{
	int radius = 1;
	
	RoundGlyph(int r){
		radius = r;
		
		System.out.println("RoundGlyph.constructor.radius = " + radius);
	}
	
	void draw(){
		System.out.println("RoundGlyph.draw.radius = " + radius);
	}
}


public class PolyConstructor {
	public static void main(String[] args){
		new RoundGlyph(5);
	}
}
