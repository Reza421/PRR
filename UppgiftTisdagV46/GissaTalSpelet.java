import java.util.Scanner;
import java.util.Random; 
public class GissaTalSpelet {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Random rand = new Random(); 
		
		int randomNumber = rand.nextInt(100);
		
		System.out.println("Gissa Talet Jag T�nker P�!");
		int gissatNummer = input.nextInt();
		
		if(gissatNummer==randomNumber) {
			
			System.out.println("Congrats! You Guessed RIGHT!!!");
			System.exit(0);
			
			
		}
	
		
		
		
		//1. T�nka p� ett tal
		//2. Gissa talet 
		//3. S�ga om det �r r�tt eller fel
		//4. om det �r r�tt d� terminatar den annars forts�tter den
		//5. S�ga om talet �r h�gre eller mindre
		//6. n�r man kan gissat r�tt tal gratulerar den dig och fr�gar om du vill k�ra igen
		
		
		
	}
}
