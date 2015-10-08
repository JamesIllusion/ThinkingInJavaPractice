//: RandVals.java
// Initializing interface fields with
// non-constant initializers

package chapter7;
import java.util.*;

public interface RandVals {
	int rInt = (int)(Math.random()*10);
	long rLong = (long)(Math.random()*10);
	float rFloat = (float)(Math.random()*10);
	double rDouble = (Math.random()*10);
}