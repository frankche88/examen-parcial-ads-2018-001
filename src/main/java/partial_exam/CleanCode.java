package partial_exam;


public class CleanCode {
	
	
	public static void main(String args[]) {
		
		int days = 20;
		
		buendia(days);
		
		int total = calcularTotal(days);
		
		System.out.println("DirtyCode.main()" + total);
		
		
	}
	
	private static void buendia(int days) {
		
		boolean good = (days % 2 == 0);
		
		
		if(!good) {
			throw new RuntimeException("no es un buen día");
		}
		
		System.out.println("es el mejor día del año");
		
	}
	
	
	private static int calcularTotal(int days) {
		
		int total = 20;
		
		if(days != 0) {
			return total + days;
		}
		
		days ++;
		
		return total + days;
		
		
	}

}

