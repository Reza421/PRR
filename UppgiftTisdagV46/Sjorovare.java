
public class Sjorovare {
	
	static void sjorovare(String str) {
		String vokaler = "aouöeiyäå";

		for (int X = 0; X < str.length(); X++) {

			char Z = str.charAt(X);
			boolean Vokaler = false;
			for (int vokal = 0; vokal < vokaler.length(); vokal++) {
				char vokalen = vokaler.charAt(vokal);
				if (Z == vokalen) {
					Vokaler = true;
				}
			}

			if (Vokaler) {
				System.out.print(Z);
				} 
			else {
				System.out.print(Z + "o" + Z);
			}
		}
	}
	
	

}
