import java.util.ArrayList;

public class Uppgifgt2 {

	    public static void main(String[] args) {
	        String Ordet = "azeR";
	        String Resultat2 = metoden(Ordet, Ordet.length() - 1, new ArrayList<String>());
	        System.out.println(Resultat2);
	    }

	    public static String metoden(String ordet, int index, ArrayList<String> bokst�ver) {
	        String Resultat = "";

	        String bokstav = "";
	        bokst�ver.add(String.valueOf(ordet.charAt(index)));

	        if (index != 0) {

	            metoden(ordet, --index, bokst�ver);
	        }

	        for (String l : bokst�ver)
	            Resultat += l;

	        return Resultat;
	}
}