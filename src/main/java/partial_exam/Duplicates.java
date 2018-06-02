package partial_exam;

import java.util.HashSet;
import java.util.Set;

public class Duplicates {
	public static void main(String[] args) {
		Duplicates duplicates = new Duplicates();
		int[] numbers = { 45, 69, 2, 1, 3, 7, 8, 9, 10, 10, 11, 15, 17, 18, 20, 25, 26, 27, 19, 38, 38 };
		ResultDto resultDto = duplicates.duplicateValuesOn(numbers);
		System.out.println("N: " + numbers.length);		
		System.out.println("Has duplicate values: " + resultDto.hasDuplicates());
		System.out.println("Steps: " + resultDto.getSteps());
	}

	public ResultDto duplicateValues(int[] numbers) {
		ResultDto resultDto = new ResultDto();
		long steps = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j< numbers.length; j++) {
				steps++;
				if (i != j && numbers[i] == numbers[j]) {
					resultDto.setHasDuplicates(true);
					resultDto.setSteps(steps);
					return resultDto;
				}
			}
		}
		resultDto.setHasDuplicates(false);
		resultDto.setSteps(steps);
		return resultDto;
	}
	
	
	public ResultDto duplicateValuesOn(int[] numbers) {
		ResultDto resultDto = new ResultDto();
		long steps = 0;
		Set<Integer> uniques = new HashSet<Integer>();
		
		for (int i = 0; i < numbers.length; i++) {
			steps++;
			boolean duplicate = !uniques.add(numbers[i]);
			
			if(duplicate) {
				resultDto.setHasDuplicates(true);
				resultDto.setSteps(steps);
				return resultDto;
			}
		}
		resultDto.setHasDuplicates(false);
		resultDto.setSteps(steps);
		return resultDto;
	}
	
	
	
	
	
	
	public class ResultDto {
		private boolean hasDuplicates;
		private long steps;
		
		public boolean hasDuplicates() {
			return hasDuplicates;
		}
		
		public void setHasDuplicates(boolean hasDuplicates) {
			this.hasDuplicates = hasDuplicates;
		}
		
		public long getSteps() {
			return steps;
		}
		
		public void setSteps(long steps) {
			this.steps = steps;
		}
	}
}
