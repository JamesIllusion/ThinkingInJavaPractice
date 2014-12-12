// Exercise 2-2
// Print three argument from console / command line input


package exercise;

import java.io.*;

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
