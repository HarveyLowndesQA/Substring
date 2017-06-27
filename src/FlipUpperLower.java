
public class FlipUpperLower {

	public static void main(String[] args) {
		
		String n = "aBcD99";
		
		/*char[] characters = n.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			if(Character.isDigit(characters[i])) {
				if(((int) characters[i]) >= 48 &&  ((int) characters[i]) < 53) System.out.print((char) ((int) ((int) characters[i]) + (((int) characters[i]) - 48)));
				else if(((int) characters[i]) > 52 &&  ((int) characters[i]) < 58) System.out.print((char) 49 + "" + (char)((((int) characters[i]) + (((int) characters[i]) - 48)) - 10));
			} else if(Character.isAlphabetic(characters[i])) {
				if(Character.isUpperCase(characters[i])) System.out.print((char) ((int) characters[i] + 32));
				else if(Character.isLowerCase(characters[i])) System.out.print((char) ((int) characters[i] - 32));
			} else {
				System.out.println(characters[i]);
			}
		}*/
		
		char[] characters = n.toCharArray();
		for(int i = 0; i < characters.length; i++) {
			char current = (char) characters[i];
			if(Character.isDigit(current)) {
				int flip = (int) current;
				if(flip < 53) System.out.print((char) ((flip * 2) - 48));
					else System.out.print((char) 49 + "" + (char) ((flip * 2) - 58));
			} else if(Character.isAlphabetic(current)) {
				if(Character.isUpperCase(current)) System.out.print((char) (((int) current) + 32));
					else System.out.print((char) (((int) current) - 32));		
			} else {
				System.out.print(current);
			}
		}
	}
	
}
