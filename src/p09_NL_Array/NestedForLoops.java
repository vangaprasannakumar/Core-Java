package p09_NL_Array;
public class NestedForLoops {
	public static void main(String[] args) {
		
		for(int i = 1; i<5; i++) {
			for(int j = 1; j<5; j++) {
				System.out.print(j+" ");}
			System.out.println();}
		System.out.println();
		
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(j+" ");}
			System.out.println();}
		System.out.println();
		for(int i = 1; i<5; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print(i+" ");}
			System.out.println();}
		System.out.println();
		System.out.println("-------------");
		int sum = 1;
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<i; j++) {
				System.out.print(sum+" ");
				sum++;}
			System.out.println();}
		System.out.println("-------------");
		System.out.println();
		
		for(int i = 1; i<=5; i++) {
			for(int j = 5; j>=i; j--) {
				System.out.print(j+" ");}
			System.out.println();}
		System.out.println();
		
		for(int i = 5; i>=1; i--) {
			for(int j = 1; j<=i; j++) {
				System.out.print(j+" ");}
			System.out.println();}
		System.out.println();
		
		int k = 1;
		for(int i = 1; i<=5; i++) {
			for(int j=1; j<=i; j++) {
				if(k%2==0) {
					System.out.print("0");}
				else {
					System.out.print("1");}
				k++;}
			System.out.println();}
	}
}