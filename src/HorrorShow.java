
interface Monster{
	void menace();
}

interface dangerousMonster extends Monster{
	void destroy();
}

interface Lethal{
	void kill();
}

class Dragon implements dangerousMonster{
	public void menace(){
		
	}
	
	public void destroy(){
		
	}
}

interface Vampire extends dangerousMonster, Lethal{
	void drinkBlood();
}

public class HorrorShow {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
