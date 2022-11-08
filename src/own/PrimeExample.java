package own;

public class PrimeExample {

	public static void main(String[] args) {
//		int num = 32, count;
//		System.out.print("First 32 prime numbers are\n");
//
//		for (int i = 1; i <= num; i++) {
//			count = 0;
//			for (int j = 2; j <= i / 2; j++) {
//				if (i % j == 0) {
//					count++;
//					break;  
//				}
//			}
//			if (count == 0) {
//				for(int j=1; j<i;j++) {
//					System.out.print(i+" ");
//				}
//				System.out.println();
//			}
//		}
		
        int num1 = 3, count1, i, j;
        for(i=0; i < num1; i++) {
            for(j=0; j < i; j++) {
                count1 = 0;
                for(int k=1; k <= j; k++) {
                    if(j%k == 0) {
                        count1++;
                    }
                }
                if(count1 == 2) {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
		
	}
	
}