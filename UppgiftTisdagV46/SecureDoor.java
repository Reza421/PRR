import java.util.ArrayList;

import java.util.Scanner;

public class SecureDoor {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int a = Integer.parseInt(input.nextLine());

		ArrayList<String> lista = new ArrayList<>();
		// hur många gånger du vill att den ska loopa
		while (a-- > 0) {
			
			String Linje = input.nextLine();
			String[] Broder = Linje.split(" ");
			
			String command = Broder[0];
			String name = Broder[1];

			if (command.equals("entry")) {
				
				boolean found = false;
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).equals(name)) {
						found = true;
						
						System.out.println(name + " entered (ANOMALY)");
						break;
					}
				}
				
				if (!found) {
					lista.add(name);
					
					System.out.println(name + " entered");
				}
			} else if (command.equals("exit")) {
				
				boolean found = false;
				for (int i = 0; i < lista.size(); i++) {
					if (lista.get(i).equals(name)) {
						found = true;
						lista.remove(i);
						
						System.out.println(name + " exited");
						break;
					}
				}
				
				if (!found) {
					System.out.println(name + " exited (ANOMALY)");
				}
			}
		}
	}

}