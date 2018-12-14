
public class Uppgifter10 {
	
	static String[] Namn = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
	public static void main(String[] args) {
			System.out.print(Nogot3());
	}
	
	public static String Nogot3() {
		//Skapar aktuella variabler. 
		 	String  Answer = "" ;
			int Time = Namn.length;
			String Stash;
			int Nogot4 = 0;
			int Nogot5 = 0 ;
			//Skapat lista med 100st platser. 
			//Med tanke att varje int plats i listan ska ha ett motsvarighet i namnlistan.
			
			int [] how = new int [100];
			//Avgör hur många namn det finns av ett namn och ger en motsvarande sifra i 'how'.
			for(int i = 0 ; i < Time; i++ ) {
				Stash = Namn[i];
				Nogot5= 0;
				//Avgör och lägger till motsvarande sifra.
				for (int e = 0; e<Time; e++) {
					
						if(Stash.equals(Namn[e])) {
						Nogot5++;
						}
				}
				how[i] = Nogot5;
				}
				// ser vilket som är det sstörsta värdet i listan. 
				// jag inser att det kommer att finas flera nomnet med det största antalet.
				//så den kommer att velja den sitat i raden om kommer att var nomnet på motsvarande plat i namn listan. 
				//
				for (int z = 0; z < how.length; z++) {
					for(int e =0; e<how.length;e++) {
						if ( how[z] > how[e]) {
		            	Nogot4 = z;
						}
					}
				}
				Answer=Namn[Nogot4];
				return Answer;
	}
}
