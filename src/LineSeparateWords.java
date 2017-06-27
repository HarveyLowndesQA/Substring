import java.util.Scanner;

public class LineSeparateWords {

	public static void main(String[] args) {
		System.out.println("Please enter a word or sentence:");
		Scanner scanner = new Scanner(System.in);
		String word = scanner.nextLine();
		scanner.close();
		
		//for(int i = 0; i < word.length(); i++) System.out.println(word.substring(i, i+1));
		
		
		//System.out.println(("Length: " + word.trim().split("\\s+").length));
		
		/*for(int i = 0; i < word.length(); i++) {
			String current = word.substring(i, i+1);
			System.out.print(current);
			if(current.equals(" ")) {
				System.out.println();
			}
		}*/

		/*String build = "";
		for(int i = 0; i < word.length(); i++) {
			String current = word.substring(i, i+1);
			if(current.equals(" ")) {
				build = System.lineSeparator() + build;
			} else { 
				build = current + build;
			}
		}
		System.out.println(build);*/
		
		
		//String[] splitWord = word.trim().split("\\s+");
		//for(int i = 0; i < splitWord.length; i++) System.out.println(splitWord[i]);
		
	//	for(int i = (word.trim().split("\\s+")).length - 1; i > -1 ; i--) System.out.println((word.trim().split("\\s+"))[i]);
		
		//for(int i = (word.trim().split("\\s+")).length - 1; i > -1 ; i--) 
		//	System.out.println((word.trim().split("\\s+"))[i]);
		
		
		//String current = word.substring(0, 6); //Prints harvey
		
		//System.out.println(current);
		
		/*int length = word.length() - 1;
		while(length > -1) {
			
			if(word.charAt(length) == ' ' || length == 0) {
				
				int tmp;
				tmp = length==0 ? 0 : length + 1;
				while(word.charAt(tmp) != ' ' || length == 1) {
					System.out.println(word.charAt(tmp));
					tmp++;
					if(tmp == word.length()) break;
					System.out.println();
				}
				
			}
			length --;
		}*/
		
		int end = word.length();
		for(int i = word.length() - 1; i > -1; i--) {
			if(word.substring(i, i+1).equals(" ")) {
				System.out.println(word.substring(i+1, end));
				end = i;
			}
			if(i == 0) {
				System.out.println(word.substring(0, end));
			}
		}
		
	}
	
}
