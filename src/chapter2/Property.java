//:Property.java

package chapter2;
import java.util.*;

/* The first Thinking in Java example program.
 * Lists system information on current machine.
 * Copyrights Bruce Eckel
 */

public class Property {
	/** Sole entry point to class & application
	 * 
	 * @param args arrat of String arguments
	 * @return No return value
	 * @exception No exception thrown
	 * 
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("--- Memory usage:");
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total Memory = "
							+ rt.totalMemory()
							+ " Free Memory = "
							+ rt.freeMemory());				

	}

}
