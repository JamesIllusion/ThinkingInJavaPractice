//: Chess.java
// Inheritance, constructors and arguments

package chapter6;

import java.io.*;

class Game{
	Game(int i){
		System.out.println("Game constructor");
	}
}

class BoardGame extends Game{
	BoardGame(int i){
		super(15);
		System.out.println("constructor of boardgame");
	}
}

public class Chess extends BoardGame{
	Chess(){
		super(11);
		System.out.println("constructor of chess");
	}

	public static void main(String[] args){
		Chess x = new Chess();
	}
}
