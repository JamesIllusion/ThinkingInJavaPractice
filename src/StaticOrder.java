class Bowl{
	Bowl(int marker){
		System.out.println("Bowl(" + makrer + ")");
	}
	void f(int marker){
		System.out.println("f(" + marker + ")");
	}
}

class Table{
	static Bowl b1 = new Bowl(1);

	Table(){
		System.out.println("Table()");
		b2.f(1);
	}

	void f2(int marker){
		System.out.println("f2(" + marker +")");
	}
	static Bowl b2 = new Bowl(2);
}

class CupBoard{
	Bowl b3 = new Bowl(3);
	static Bowl b4 = new Bowl(4);

	CupBoard(){
		System.out.println("CupBoard()");
		b4,f(2);
	}

	void f3 (int marker){
		System.out.println("f3(" + marker + ")");
	}
