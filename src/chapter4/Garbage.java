//: Garbage.java
// Demonstration of the garbage
// collector and finalization

package chapter4;

class Chair{
	static boolean gcrun = false;
	static boolean flag = false;
	static int created = 0;
	static int finalized = 0;
	int i;

	Chair(){
		i = ++created;
		if ( created == 47)
			System.out.println("Created 47");
	}

	protected void finalize(){
		if(!gcrun){
			gcrun = true;
			System.out.println("Begin to finalize after chairs have been created");
		}
		if(i == 47){
			System.out.println("Finalizing Chair #47," + Chair.created + " setting flag to stop chair creation");
			flag = true;
		}
		finalized++;
		if(finalized >= created)
			System.out.println("All has been finalized");
	}
}

public class Garbage{
	public static void main (String[] args){
		if(args.length == 0){
			System.err.println("Usage: ......");
			return;
		}

		while(!Chair.flag){
			new Chair();
			new String("to take space");
		}

		System.out.println("After all chairs have been created");
		System.out.println("created = " + Chair.created);

		if(args[0].equals("before")){
			System.out.println("gc():");
			System.gc();
			System.out.println("runFinalize");
			System.runFinalization();
		}

		System.out.println("bye");

		if(args[0].equals("after"))
			System.runFinalizersOnExit(true);
	}
}
		
