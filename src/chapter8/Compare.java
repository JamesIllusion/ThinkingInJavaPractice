//: Compare.java
// Interface for sorting callback

package chapter8;

public interface Compare {
	boolean lessThan(Object lhs, Object rhs);
	boolean lessThanOrEqual(Object lhs, Object rhs);
}
