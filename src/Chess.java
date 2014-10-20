import java.io.*;

class Game{
	Game(int i){
		System.out.println("consturctor of game");
		System.out.println(i);
	}
}

class BoardGame extends Game{
	BoardGame(){
		super(15);
		System.out.println("constructor of boardgame");
	}
}

public class Chess extends BoardGame{
	Chess(){
		super();
		System.out.println("constructor of chess");
	}

	public static void main(String[] args){
		Chess x = new Chess();
	}
}
