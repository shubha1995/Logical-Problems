package javaLogicalPrograms;

public class PerfectNumber {

		public static void main(String[] args) {
			int i, n, Sum = 0 ;		
			System.out.println("\n Please Enter any Number: ");
			n = Utility.getUserSpecificInteger();

			for(i = 1 ; i < n/2 ; i++) {
				if(n % i == 0)  {
					Sum = Sum + i;
				}
			}
			if (Sum == n/2) {
				System.out.format("\n% d is a Perfect Number", n);
			}
			else {
				System.out.format("\n% d is NOT a Perfect Number", n);
			}
		}
	}


