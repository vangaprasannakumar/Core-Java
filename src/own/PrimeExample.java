package own;

public class PrimeExample {

	public static void main(String[] args) {
		int num = 32, count;
		System.out.print("First 32 prime numbers are\n");

		for (int i=1;i<=num;i++) {
			count = 0;
			for (int j=2;j<=i/2;j++) {
				if (i%j == 0) {
					count++;
					break;  
				}
			}
				if (count == 0) {
					
					int sum = i;
					for(int x = 1; x<=5; x++) {
						for(int j=1; j<x; j++) {
							System.out.print(sum+" ");
							}
						System.out.println();
						}
					
					
//					for(int j=1; j<i;j++) {
//						System.out.print(i+" ");
//					}
//					System.out.println();
			}
		}

	}
	
}