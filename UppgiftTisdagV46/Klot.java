

public class Klot {
	
	public static void main(String[] args) {
	
	System.out.println(volumeOfSphere(10));
	}
	
	static double volumeOfSphere(double radien) {
		
		double Volym = (4*Math.PI*Math.pow(radien, 3))/3;
		return Volym;
		
	}



	
}