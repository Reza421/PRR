
public class Uppgifter2 {

		static String[] names = {"Crystal","Tam","Ed","Beulah","Daina","Benjamin","Kia","Clelia","Cassy","Gita","Celsa","Karoline","Talitha","Lewis","Betsy","Colin","Glendora","Carola","Rosalba","Jeanie","Yevette","Armand","Neal","Lilla","Dorethea","Delta","Maye","Nikita","Shoshana","Carola","Margie","Haywood","Venessa","Natacha","Gilbert","Kandi","Tyisha","Tammie","Blossom","Penney","Diana","Audrey","Willard","Zoraida","Drusilla","Jacquline","Cyndy","Janiece","Tressie","Kami","Lashanda","Leann","Tom","Santana","Junita","Gisela","Tom","Marquerite","Bryant","Lauralee","Yael","Kelle","Samantha","Tom","Meta","Lanette","Wanetta","Carola","Jana","Neal","Brady","Rigoberto","Felicia","Hellen","Georgeann","Carola","Isaias","Ellis","Roseanne","Lenard","Ela","Ophelia","Alesha","Mafalda","Flor","Kelsi","Autumn","Sondra","Pasty","Jacquelyne","Benjamin","Emmie","Mickie","Lang","Jamee","Felice","Daniella","Carola","Nathalie","Genevive"};
			public static void main(String[] args) {
			//Skriver ut svaren ifr�n metoden.
				System.out.print(Uppgift());
				
			}
		
				public static int Uppgift () {
						//Skapar en variaben som r�knar hur m�nga namn av ett.
						int ansor = 0;
						//Skapar en variabel f�r hur l�ng loppen ska vara.
						int tims = names.length;
						//P�b�rjar en lopp som testar hur m�nga g�nger namnet 'Tom' finns i arryeyn.
						for(int i = 0 ; i < tims; i++ ) {
							//ser om namnet tom fin p� en given plats. om sant addera med ett p� r�knar variaben
							if (names[i].equals("Tom")||names[i].equals("tom")) {
								ansor++;
							}
			
						}
						//retunera svar.
				return ansor;
				}
	}

