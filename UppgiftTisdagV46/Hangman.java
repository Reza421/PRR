import hangman.HangmanConsoleWindow;
import java.util.*;

public class Hangman {

	public static void main(String[] args) 
	{
		boolean reset = true;
		if(reset == false) {
			  
		  }
		while (reset) {
		
		HangmanConsoleWindow console = new HangmanConsoleWindow();

		    //Alla Typer
		    String SjälvaOrdet;
		    char[] Något;
		    int Längd;
		    char[] något2; 
		    int försök = 11;
		    int times = 0; //hur många gånger bokstaven finns i ordet


		    StringBuilder pastconsolees = new StringBuilder(); //String Byggare

		    console.println("Skriv ordet du vill att personen\nska gissa: ");
		    SjälvaOrdet = console.nextString();  
		    SjälvaOrdet = SjälvaOrdet.toUpperCase(); //Lagrar ordet och gör det till stora bokstäver
		    Längd = SjälvaOrdet.length(); 

		    Något = SjälvaOrdet.toCharArray(); //Skapar char array av string 

		    //Skapar och printar en array av chars med samma summa som string 
		    något2 = SjälvaOrdet.toCharArray(); 
		    console.print("Ordet är: ");

		    for (int index = 0; index < Längd; index++){
		        något2[index] = '*';
		    }
		    while (String.valueOf(något2).equals(SjälvaOrdet)== false && försök != 0){

		        //Alla variabler i loopen
		        char Gissning;
		        String Något3;
		        String Något4;
		        boolean correct = false; //säger till dig om bokstaven finns i ordet eller inte/ är en loop
		        
		        boolean repeated = false; //kollar om du skrivit bokstaven två gånger

		        //Skriver hemliga ordet
	        	String temp = "";
		        for(int a= 0; a < Längd; a++){
		        	temp = temp + något2[a];
		        }
	             console.println(temp);

		        //Frågar usern för consolen sedan lägger den i consolen
	            console.println("Du har så många liv: " + försök);
		        console.println("Gissa: ");
		        Något3 = console.nextString();
		        console.clear();
		        Gissning = Något3.charAt(0); //Får char data från consolen

		        pastconsolees.append(Gissning); //Ger consolen till andra console stringen
		        Något4 = pastconsolees.toString();

		        //Kollar om du redan skrivit boktaven eller inte
		        if (Något4.lastIndexOf(Gissning, Något4.length() -2 ) != -1){
		            console.println("Du har redan gissat på bokstäverna:");
		            pastconsolees.deleteCharAt(Något4.length()-1); 
		            console.println(Något4.substring(0, Något4.length()-1));
		            console.println();
		            repeated = true;
		        }

		        //Om det inte är samma bokstav som du skrev förr så kollar den med consolen om det är rätt bokstav
		        if (repeated == false){
		            for (int index = 0; index < Längd; index++){

		                 if(Något[index] == Character.toUpperCase(Gissning)) {

		                     något2[index] = Character.toUpperCase(Gissning);  //ändrar till stora bokstäver             
		                     correct = true; 
		                     times++; 
		                  }
		            }
		            if(correct == true){
		                console.println("Boktaven " + Gissning + " är i Ordet!");
		            }

		            else if (correct == false){
		                console.println("Du gissa fel! Ordet är fortvarande:  ");
		                försök--;
		                
		           
		                if (försök == 0) {
		       
		                	console.println("DU HAR FÖRLORAT!");
		                }
		            }
		            console.println();
		        }
		    }
		  if (String.valueOf(något2).equals(SjälvaOrdet)) {
			  console.println("Grattis! Du gissa hela Ordet: "+ SjälvaOrdet.toUpperCase() + " \nDet tog dig " + times + " Försök!");
		  }

		  console.println("Vill du spela en gång till?");
		  console.println("1 = Ja");
		  console.println("2 = Nej");
		  String in = console.nextString();
		  if(in.equals("1")) {
			  reset = true;
		  }
		  else {
			  reset = false;
		  }

		}
		
	}
}
