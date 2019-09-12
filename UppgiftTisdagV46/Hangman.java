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
		    String Sj�lvaOrdet;
		    char[] N�got;
		    int L�ngd;
		    char[] n�got2; 
		    int f�rs�k = 11;
		    int times = 0; //hur m�nga g�nger bokstaven finns i ordet


		    StringBuilder pastconsolees = new StringBuilder(); //String Byggare

		    console.println("Skriv ordet du vill att personen\nska gissa: ");
		    Sj�lvaOrdet = console.nextString();  
		    Sj�lvaOrdet = Sj�lvaOrdet.toUpperCase(); //Lagrar ordet och g�r det till stora bokst�ver
		    L�ngd = Sj�lvaOrdet.length(); 

		    N�got = Sj�lvaOrdet.toCharArray(); //Skapar char array av string 

		    //Skapar och printar en array av chars med samma summa som string 
		    n�got2 = Sj�lvaOrdet.toCharArray(); 
		    console.print("Ordet �r: ");

		    for (int index = 0; index < L�ngd; index++){
		        n�got2[index] = '*';
		    }
		    while (String.valueOf(n�got2).equals(Sj�lvaOrdet)== false && f�rs�k != 0){

		        //Alla variabler i loopen
		        char Gissning;
		        String N�got3;
		        String N�got4;
		        boolean correct = false; //s�ger till dig om bokstaven finns i ordet eller inte/ �r en loop
		        
		        boolean repeated = false; //kollar om du skrivit bokstaven tv� g�nger

		        //Skriver hemliga ordet
	        	String temp = "";
		        for(int a= 0; a < L�ngd; a++){
		        	temp = temp + n�got2[a];
		        }
	             console.println(temp);

		        //Fr�gar usern f�r consolen sedan l�gger den i consolen
	            console.println("Du har s� m�nga liv: " + f�rs�k);
		        console.println("Gissa: ");
		        N�got3 = console.nextString();
		        console.clear();
		        Gissning = N�got3.charAt(0); //F�r char data fr�n consolen

		        pastconsolees.append(Gissning); //Ger consolen till andra console stringen
		        N�got4 = pastconsolees.toString();

		        //Kollar om du redan skrivit boktaven eller inte
		        if (N�got4.lastIndexOf(Gissning, N�got4.length() -2 ) != -1){
		            console.println("Du har redan gissat p� bokst�verna:");
		            pastconsolees.deleteCharAt(N�got4.length()-1); 
		            console.println(N�got4.substring(0, N�got4.length()-1));
		            console.println();
		            repeated = true;
		        }

		        //Om det inte �r samma bokstav som du skrev f�rr s� kollar den med consolen om det �r r�tt bokstav
		        if (repeated == false){
		            for (int index = 0; index < L�ngd; index++){

		                 if(N�got[index] == Character.toUpperCase(Gissning)) {

		                     n�got2[index] = Character.toUpperCase(Gissning);  //�ndrar till stora bokst�ver             
		                     correct = true; 
		                     times++; 
		                  }
		            }
		            if(correct == true){
		                console.println("Boktaven " + Gissning + " �r i Ordet!");
		            }

		            else if (correct == false){
		                console.println("Du gissa fel! Ordet �r fortvarande:  ");
		                f�rs�k--;
		                
		           
		                if (f�rs�k == 0) {
		       
		                	console.println("DU HAR F�RLORAT!");
		                }
		            }
		            console.println();
		        }
		    }
		  if (String.valueOf(n�got2).equals(Sj�lvaOrdet)) {
			  console.println("Grattis! Du gissa hela Ordet: "+ Sj�lvaOrdet.toUpperCase() + " \nDet tog dig " + times + " F�rs�k!");
		  }

		  console.println("Vill du spela en g�ng till?");
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
