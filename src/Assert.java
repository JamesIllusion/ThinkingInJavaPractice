public class Assert{
	private static void perr(String msg){
		System.err.println(msg);
	}

	public final static void isTrue(boolean exp){
		if(!exp)perr("Assertion failed");
	}
}
