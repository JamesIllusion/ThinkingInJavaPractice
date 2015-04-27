class Sundae{
	private Sundae(){}
	static Sundae makeASundae(){
		return new Sundae();
	}
}

public class IceCream{
	static String[] flav = {
		"Chocolate", "Strawberry",
		"Vanilla", "Mint", "Mango",
		"Mocha", "Rum", "Peach"
	};
	
	static String[] flavorSet(int n){
		n = Math.abs(n) % (flav.length+1);
		
		String[] results = new String[n];
		int[] picks = new int[n];
		
		for (int i=0; i<picks.length; i++)
			picks[i] = -1;
		
		for (int i=0; i<picks.length; i++){
			retry;
			while(true){
				int t = (int)(Math.random()*flav.length);
				
				for(int j=0; j<i; j++)
					if(picks[j] == t)
						retry;
				
				picks[i] = t;
				results[i] = flav[t];
				break;
			}
		}
	}
	
	public static void main(String[] args){
//		Sundae x = new Sundae();
		Sundae y = Sundae.makeASundae();
		
	}
}
