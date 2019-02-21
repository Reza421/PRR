import java.util.Scanner;
import java.util.Random; 
public class GissaTalSpelet {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		Random rand = new Random(); 
		
		int randomNumber = rand.nextInt(100);
		
		System.out.println("Gissa Talet Jag Tänker På!");
		int gissatNummer = input.nextInt();
		
		if(gissatNummer==randomNumber) {
			
			System.out.println("Congrats! You Guessed RIGHT!!!");
			System.exit(0);
			
			
		}
	
		
		
		
		//1. Tänka på ett tal
		//2. Gissa talet 
		//3. Säga om det är rätt eller fel
		//4. om det är rätt då terminatar den annars fortsätter den
		//5. Säga om talet är högre eller mindre
		//6. när man kan gissat rätt tal gratulerar den dig och frågar om du vill köra igen
		
		
		
	}
}
