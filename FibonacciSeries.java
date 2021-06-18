package javaLogicalPrograms;

public class FibonacciSeries {

    public static void main(String[] args) {

    	int a = 0;
        int b = 1;
        System.out.println("Enter Number: ");
        int n = Utility.getUserSpecificInteger();
        System.out.println("Fibonacci Series Upto " + n + ": ");

        while (a <= n) {
            System.out.print(b + ", ");

            int c = a + b;
            a = b;
            b = c;

        }
    }
    }
