import java.util.Scanner;
import java.util.Random; 
public class GissaTalSpelet {

	public static void main(String[] args) {
	
		boolean playing = true; // Sant eller falskt i detta samanhanget sant 
		
	while(playing) {
		Scanner input = new Scanner(System.in);
		
		Random rand = new Random(); 
		
		int randomNumber = rand.nextInt(11);
		// väljer ett av de talen som är skrivet
		// och det tar alltid bort ett nummer så det blir faktiskt 10 istället för 11
		
		System.out.println("Gissa Talet Jag Tänker På!"); //Skriver ut det som står inom paranteserna
		int gissatNummer = 0;
		// jag kallar int för gissatNummer med värdet 0
		
		
		while(gissatNummer!=randomNumber) {
		// Datorn kommer välja ett sluppmässigt tal
			 gissatNummer = input.nextInt();
			// Datorn sätter in talet in i inputen
			
			if(randomNumber>gissatNummer){
				System.out.println("Mitt Tal är större!" );
				// Om du gissar på ett lägre nummer kommer den visa dig detta meddelandet
			} else if(randomNumber<gissatNummer) {
				System.out.println("Mitt tal är mindre!");
				// Om du gissar på ett högre nummer kommer den visa dig detta meddelandet
			}
	}
		
		
		if(gissatNummer==randomNumber) {
			// Om talet och random talet matcher
			System.out.println("GRATTIS! DU GISSA RÄTT!!!");
			// När ditt nummer matcher med det nummer datorn har valt
			System.out.println("     ");
			// Så att det har ett litet mellanrum mellan texten
			System.out.println("Vill du köra igen? 1=Ja 2=Nej" );
			// Om du vill verkligen köra igen.
			int koraigen = input.nextInt();
			
			if (koraigen == 2) {
				// om du väljer talet 2 så stannar spelet 
				playing = false;
				// Då vet datorn att det är falskt
				System.out.println("Tack för att du spela med oss!");
				// och skriver ut denna texten
			}
			
			
		}
		
		
		//1. Tänka på ett tal
		//2. Gissa talet 
		//3. Säga om det är rätt eller fel
		//4. om det är rätt då terminatar den annars fortsätter den
		//5. Säga om talet är högre eller mindre
		//6. när man kan gissat rätt tal gratulerar den dig och frågar om du vill köra igen
		
		
		}
	}
}