import java.util.Scanner;

public class Övningsuppgifter {
	
	public static void main(String[] args) {
		
		double tal = 1;
		double summa = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Skriv ett nummer: ");
		
		while (tal != 0) {
			
			tal = input.nextDouble();
			
			summa += tal;
			// summa = summa + tal; (samma sak)
			
		}

		System.out.println("Summan av alla nummer är: " + summa);
		
		input.close();
		
	}
	
}