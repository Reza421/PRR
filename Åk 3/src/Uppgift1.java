public class Uppgift1{
	
	public static void main(String[] args) {
		int[] heltal= {1,4,6};
		
		int summa = summering(heltal);
		
		System.out.println(summa);
	}
	
	public static int summering(int[] heltal) {
		
		int summa = 0;
		
		for (int tal : heltal) {
			
			summa += tal;	
		}
			
		return summa;
	}

	
	
	
	
	
	
}