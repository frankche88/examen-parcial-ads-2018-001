package partial_exam.dirty;


public class DirtyCode {
	
	
	public static void main(String args[]) {
		
		int days = 20;
		
		buendia(days);
		
		int total = calcularTotal(days);
		
		System.out.println("DirtyCode.main()" + total);
		
		
	}
	
	private static void buendia(int days) {
		
		boolean good = false;
		
		
		if (days % 2 == 0)
		{
			good = true;
		}
		
		if(good) {
			
			System.out.println("es el mejor día del año");
			
		}	else {
			
			throw new RuntimeException("no es un buen día");
			
		}
		
	}
	
	
	private static int calcularTotal(int days) {
		
		int total = 20;
		if(days == 0) {
			days ++;
			
			total = total + days;
			
		} else {
			total = total + days;
		}
		
		return total;
		
	}

}

