import java.util.Scanner;
import java.util.Random; 
public class GissaTalSpelet {

	public static void main(String[] args) {
	
		boolean playing = true; // Sant eller falskt i detta samanhanget sant och
		
	while(playing) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(); 
		
		int randomNumber = rand.nextInt(11);
		
		System.out.println("Gissa Talet Jag T�nker P�!"); //Skriver ut det som st�r inom paraenteserna
		int gissatNummer = 0;
		
		
		
		while(gissatNummer!=randomNumber) {
			
			 gissatNummer = input.nextInt();
			
			
			
			if(randomNumber>gissatNummer){
				System.out.println("Mitt Tal �r st�rre!" );
			} else if(randomNumber<gissatNummer) {
				System.out.println("Mitt tal �r mindre!");
			}
	}
		
		
		if(gissatNummer==randomNumber) {
			
			System.out.println("GRATTIS! DU GISSA R�TT!!!");
			System.out.println("     ");
			System.out.println("Vill du k�ra igen? 1=Ja 2=Nej" );
			int koraigen = input.nextInt();
			
			if (koraigen == 2) {
				playing = false;
				System.out.println("Tack f�r att du spela med oss!");
			}
			
			
		}
		
		
		//1. T�nka p� ett tal
		//2. Gissa talet 
		//3. S�ga om det �r r�tt eller fel
		//4. om det �r r�tt d� terminatar den annars forts�tter den
		//5. S�ga om talet �r h�gre eller mindre
		//6. n�r man kan gissat r�tt tal gratulerar den dig och fr�gar om du vill k�ra igen
		
		
		}
	}
}