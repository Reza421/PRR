import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
	
		

		Scanner input = new Scanner(System.in);
		
		int choice;
		
		do {
		System.out.println("Welcome to music inspiration database! Please choose a genre!");
		System.out.println("(1) - Hip hop");
		System.out.println("(2) - Rap");
		System.out.println("(3) - Jazz");
		System.out.println("(4) - Dubstep");
		System.out.println("(5) - Rock");
		System.out.println("(6) - Quit");
		System.out.println();
		
		

		choice = input.nextInt();
			
		
		String genre;

		switch (choice) {
		
		case 1:
			
			genre = "Hip hop";
			System.out.println("You chose " + genre + "! Here are some good songs!");
			System.out.println();
			System.out.println("1. Ni**as In Paris by Jay-Z & Kayne West");
			System.out.println("2. Juicy by The Notorious B.I.G");
			System.out.println("3. Lose Yourself by Eminem");
			System.out.println("4. Hit Em Up by Tupac");
			System.out.println();
			
			
			
			break;
			
		case 2:
			
			genre = "Rap";
			System.out.println("You chose " + genre + "! Here are three good songs!");
			System.out.println();
			System.out.println("1. Many Men by 50 Cent");
			System.out.println("2. Rap God by Eminem");
			System.out.println("3. Gin And Juice by Snoop dogg");
			System.out.println();


			
			break;
			
		case 3:
			
			genre = "Jazz";
			System.out.println("You chose " + genre + "! Here are three good songs!");
			System.out.println();
			System.out.println("1. My Funny Valentine by Frank Sinatra");
			System.out.println("2. Take Five by Dave Brubeck");
			System.out.println("3. So What by Miles Davis");
			System.out.println();
			
			
			break;
			
		case 4:
			
			genre = "Dubstep";
			System.out.println("You chose " + genre + "! Here are three good songs!");
			System.out.println();
			System.out.println("1. Bangarang by Skrillex");
			System.out.println("2. Don't You Worry Child by Swedish House Mafia");
			System.out.println("3. Ghost 'n' Stuff by Deadmau5");
			System.out.println();
			
			
			break;
			
		case 5:
			
			genre = "Rock";
			System.out.println("you have chosen the genre " + genre + "! Here are three good songs");
			System.out.println();
			System.out.println("1. We Will Rock You vy Queen");
			System.out.println("2. Born to Run by Bruce Springsteen");
			System.out.println("3. Remember Rain by Guns N' Roses");
			System.out.println();
			System.out.println("4. Get back to the list");
			
		case 6:
			
			System.out.println("Thank you for today!");
			
			break;
			
		default:
			
			genre = "invalid";
			System.out.println("You have made a " + genre + " choice! Too bad for you!");
			System.out.println();
			
			break;
			
			
			
		}
		} while (choice != 6);
		input.close();
		}	
		
	}
