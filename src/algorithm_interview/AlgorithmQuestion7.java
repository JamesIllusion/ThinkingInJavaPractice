// given a sentence, reverse the sequence of words in the sentence without reverse the character in words.

// answer: split words, and reverse the whole sentence, then reverse back to each word.
// answer2: using stack, push the whole sentence, and pop the stack.

package algorithm_interview;

public class AlgorithmQuestion7 {
	
	// this class should not be instantiated
	private AlgorithmQuestion7(){}
	
	static String reverseString(String str){
		if(str==null)
			System.out.println("ERROR: Input string is empty!");
		
		StringBuilder curString = new StringBuilder(str.length());
		
		for(int i=str.length()-1; i>=0; i--)
//			curString.append(str[i]);
			System.out.println(str);
		
		return str;
	}

}
