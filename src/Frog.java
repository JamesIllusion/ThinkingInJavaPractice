class DoBaseFinalization{
	public static boolean flag = false;
}

class Characteristics{
	private String str;
	
	Characteristics(String c){
		str = c;
		
		System.out.println("Creating charactics " + str);
	}
	
	protected void finalize(){
		System.out.println("finalizing characteristics " + str);
	}
}

class LivingCreature{
	Characteristics p = new Characteristics("is_alive");
	
	LivingCreature(){
		System.out.println("LivingCreature.constructor");
	}
	
	protected void finalize(){
		System.out.println("LivingCreature.finalize");
		
		if(DoBaseFinalization.flag)
			try{
				super.finalize();
			} catch(Throwable t){}
	}
}

class Animal extends LivingCreature{
	Characteristics p = new Characteristics("has_heart");
	
	Animal(){
		System.out.println("Animal.constructor");
	}
	
	protected void finalize(){
		System.out.println("Animal.finalize");
		
		if(DoBaseFinalization.flag)
			try{
				super.finalize();
			} catch(Throwable t){}
	}
}

class Amphibian extends Animal{
	Characteristics p = new Characteristics("can_live_in_water");
	
	Amphibian(){
		System.out.println("Amphibian.constructor");
	}
}

public class Frog {

}
