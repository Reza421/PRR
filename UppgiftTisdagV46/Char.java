
public class Char {
	
	public static void main(String[] args) {
		System.out.println(countChar("Hussein", 's'));
	}
	
	public static int countChar(String namn, char c) {
		int count = 0;
		for (char bokstav : namn.toCharArray()) {

			System.out.println("Bokstav: " + bokstav + " = " + c + " ?");
			if(bokstav == c) {
				count++;
				System.out.println("JA");
			}
		}
		return count;
		
}
	
	
	
}