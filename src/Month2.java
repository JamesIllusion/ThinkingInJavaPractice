
public final class Month2 {
	private String name;
	private Month2(String nm){
		name = nm;
	}
	public String toString(){
		return name;
	}
	
	public final static Month2
		EMP = new Month2("Empty"),
		JAN = new Month2("January"),
		FEB = new Month2("Febuary"),
		MAR = new Month2("March"),
		APR = new Month2("April"),
		MAY = new Month2("May"),
		JUN = new Month2("June"),
		JUL = new Month2("July"),
		AUG = new Month2("August"),
		SEP = new Month2("September"),
		OCT = new Month2("October"),
		NOV = new Month2("November"),
		DEC = new Month2("December");
	
	public final static Month2[] month = {
		EMP,JAN, FEB, MAR, APR, MAY, JUN,
		JUL, AUG, SEP, OCT, NOV, DEC
	};
	
	public static void main(String[] args){
		Month2 mon = Month2.JAN;
		System.out.println(mon);

		mon = Month2.month[11];
		//m = Month2.month[month.length];
		System.out.println(mon);
		//System.out.println(m == Month2.DEC);
	}
}
