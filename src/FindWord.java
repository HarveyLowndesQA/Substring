import java.util.ArrayList;
import java.util.List;

public class FindWord {

	public static void main(String[]  args) {
		String message = "Elinor Sian Thorne";
		String search = "Elinor";
		String replace = "Charles";
		System.out.println(findWord(message, search, replace));
	}
	
	/*public static void findWord(String message, String search) {
		
		int wordCount = 0;
		List<Integer> positions = new ArrayList<Integer>();
		
		int length = search.length();
		for(int i = 0; i < message.length(); i++) {
			String tmpWord = "";
			if((i + length) <= message.length()) {
				tmpWord = message.substring(i, i+length);
			}
			if(tmpWord.equals(search)) {
				positions.add(i);
				wordCount++;
			}				
		}
		
		System.out.println("Word Count: "+ wordCount);
		System.out.print("Word Positions: ");
		for(Integer pos : positions) {
			System.out.print(pos + ", ");
		}
		
	}*/
	
	
	public static void findWord(String message, String search) {
		
		int wordCount = 0;
		String positions = "";
		
		int length = search.length();
		for(int i = 0; i < message.length(); i++) {
			String tmpWord = "";
			if((i + length) <= message.length()) {
				tmpWord = message.substring(i, i+length);
				if(tmpWord.equals(search)) {
					positions += i + ", ";
					wordCount++;
				}
			}
		}
		
		System.out.println("Word Count: "+ wordCount);
		System.out.println("Word Positions: " + positions);
		
	}
	
	public static String findWord(String message, String search, String replace) {
		
		String newWord = "";
		
		/*
		 * Remove case sensitivity.
		 */
		message = message.toLowerCase();
		search = search.toLowerCase();
		replace = replace.toLowerCase();
		
		int length = search.length();
		for(int i = 0; i < message.length(); i++) {
			String tmpWord = "";
			if((i + length) <= message.length()) {
				tmpWord = message.substring(i, i+length);
			}
			if(tmpWord.equals(search)) {
				newWord = newWord + replace;
				i = i + search.length()-1;
			} else {
				newWord = newWord + message.substring(i, i+1);
			}
		}
		
		return newWord;
		
	}
	
}
