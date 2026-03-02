public class primes {

    public primes(){}

	public int howManyPrimes(int[] numList) {

		int count = 0;

    		boolean check = true;

    		for (int num : numList) {

      			check = true;

      			for (int i = 2; i <= num/2; i++) {

        			if (num % i == 0) {

          				check = false;

        			}

      			}

      			if (num == 1) {

        			check = false;

      			}

      			if (check) {

        			count++;

      			}

			}	

    		return count;

  	}

}

