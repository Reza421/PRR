import java.util.Scanner;
import java.util.Random; 
public class GissaTalSpelet {

	public static void main(String[] args) {
	
		boolean playing = true; // Sant eller falskt i detta samanhanget sant 
		
	while(playing) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random(); 
		
		int randomNumber = rand.nextInt(11);
		// v�ljer ett av de talen som �r skrivet
		// och det tar alltid bort ett nummer s� det blir faktiskt 10 ist�llet f�r 11
		
		System.out.println("Gissa Talet Jag T�nker P�!"); //Skriver ut det som st�r inom paranteserna
		int gissatNummer = 0;
		// jag kallar int f�r gissatNummer med v�rdet 0
		
		
		while(gissatNummer!=randomNumber) {
		// Datorn kommer v�lja ett sluppm�ssigt tal
			 gissatNummer = input.nextInt();
			// Datorn s�tter in talet in i inputen
			
			if(randomNumber>gissatNummer){
				System.out.println("Mitt Tal �r st�rre!" );
				// Om du gissar p� ett l�gre nummer kommer den visa dig detta meddelandet
			} else if(randomNumber<gissatNummer) {
				System.out.println("Mitt tal �r mindre!");
				// Om du gissar p� ett h�gre nummer kommer den visa dig detta meddelandet
			}
	}
		
		
		if(gissatNummer==randomNumber) {
			// Om talet och random talet matcher
			System.out.println("GRATTIS! DU GISSA R�TT!!!");
			// N�r ditt nummer matcher med det nummer datorn har valt
			System.out.println("     ");
			// S� att det har ett litet mellanrum mellan texten
			System.out.println("Vill du k�ra igen? 1=Ja 2=Nej" );
			// Om du vill verkligen k�ra igen.
			int koraigen = input.nextInt();
			
			if (koraigen == 2) {
				// om du v�ljer talet 2 s� stannar spelet 
				playing = false;
				// D� vet datorn att det �r falskt
				System.out.println("Tack f�r att du spela med oss!");
				// och skriver ut denna texten
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