package p09_NL_Array;

public class PrimeExample {

	public static void main(String[] args) {

	        int num = 32, count;
	        
	        System.out.print("First 32 prime numbers are\n");
	 
	        //Loop through each number starting from 1
	        for (int i = 1; i <= num; i++) {
	            count = 0;
	           //Check if the number is divisible by any number from 2 to itself
	           for (int j = 2; j <= i / 2; j++) {
	                if (i % j == 0) {
	                    count++;
	                    break;
	                }
	            }
	            //If the number is not divisible by any number then it is prime
	            if (count == 0) {
	            	for(int j=1; j<i;j++) {
	    				System.out.print(i+" ");
	    				}
	    			System.out.println();
	            }
	        }
	}

}
