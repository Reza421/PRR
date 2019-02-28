import java.util.Scanner;
import java.util.Random; 
public class GissaTalSpelet {

	public static void main(String[] args) {
	
		boolean playing = true; // Sant eller falskt i detta samanhanget sant och
		
	while(playing) {
		Scanner input = new Scanner(System.in);
		Random rand = new Random(); 
		
		int randomNumber = rand.nextInt(11);
		
		System.out.println("Gissa Talet Jag Tänker På!"); //Skriver ut det som står inom paraenteserna
		int gissatNummer = 0;
		
		
		
		while(gissatNummer!=randomNumber) {
			
			 gissatNummer = input.nextInt();
			
			
			
			if(randomNumber>gissatNummer){
				System.out.println("Mitt Tal är större!" );
			} else if(randomNumber<gissatNummer) {
				System.out.println("Mitt tal är mindre!");
			}
	}
		
		
		if(gissatNummer==randomNumber) {
			
			System.out.println("GRATTIS! DU GISSA RÄTT!!!");
			System.out.println("     ");
			System.out.println("Vill du köra igen? 1=Ja 2=Nej" );
			int koraigen = input.nextInt();
			
			if (koraigen == 2) {
				playing = false;
				System.out.println("Tack för att du spela med oss!");
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