package performance.com.walmart;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		Date startDate = new Date();
		PrimeNumbers primeNumbers = new PrimeNumbers();
		Integer max = Integer.parseInt(args[0]);
		primeNumbers.generateNumbers(max);
		Date endDate = new Date();
		System.out.println("The elapsed time " +(endDate.getTime()-startDate.getTime())+ " ms");
	}

}
