//:Exercise 2-2

package chapter2;
import java.io.*;

//Print three argument from console / command line input

public class ArgOutput_Ch2Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try{
			BufferedReader input = new BufferedReader(
					new InputStreamReader(
							System.in)
					);
			
			System.out.println("Please input three arguments");
			String str1 = input.readLine();
			String str2 = input.readLine();
			String str3 = input.readLine();
			System.out.println("Arg_1 = " + str1 + ", Arg_2 = " + str2 + ", Arg_3 = " + str3);
		}catch (Exception ex){
			ex.printStackTrace();
		}
	}

}
