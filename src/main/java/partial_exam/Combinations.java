package partial_exam;

public class Combinations {
	
	
	/*
	 * 
	 * Una escalera tiene N pasos, una persona puede subir de 1, 2 o 3 pasos a la vez, 
	 * se requirió retornar el número de combinaciones posibles en la que se puede subir 
	 * la escalera para lo cual se escribió el siguiente algoritmo:
	 * 
	 */
	
	
	
	
	
	public static void main(String[] args) {
		Combinations combinations = new Combinations();
		
		
		
		
		for(int n=0; n<25; n++) {
			System.out.println(n + "\t" + combinations.countCombinationsDinamica(n, 0));
			
		}
		
		
	}

	public long countCombinations(int n, int level) {
		if (n < 0) {
			return 0;
		}
		if (n == 0 && level == 0) {
			return 0;
		}
		if (n == 0 && level > 0) {
			return 1;
		}
		return countCombinations(n - 1, level + 1) + countCombinations(n - 2, level + 1)
				+ countCombinations(n - 3, level + 1);
	}
	
	
	public long countCombinationsDinamica(int n, int level) {
		
		
		if (n == 0 ) {
			return 0;
		}
		

		if (n == 1 ) {
			return 1;
		}
		
		if (n == 2) {
			return 2;
		}
		long vector[] = new long[n+1] ;
		vector[0] = 1;
		vector[1] = 1;
		vector[2] = 2;
		
		for(int k=3; k < n + 1; k++) {
			vector[k] = vector[k-1] + vector[k-2] + vector[k-3];
		}
		
		return vector[n];
		
	}



}