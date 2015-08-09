import java.util.*;

class Groundhog{
	int ghNumber;
	Groundhog(int n){
		ghNumber = n;
	}
}

class Prediction{
	boolean shadow = Math.random()>0.5;
	
	public String toString(){
		if(shadow)
			return " Six more weeks of Winter!";
		else
			return "Early Spring!";
	}
}

public class SpringDetector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
