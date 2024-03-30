package Arithmetic;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      double a,b;

        System.out.print("Enter a number: ");
        a=scanner.nextDouble();
        System.out.print("Enter a number: ");
        b=scanner.nextDouble();

        Arithmetic arithmetic = new Arithmetic(a, b);
        System.out.println(arithmetic.add());


//        System.out.println(arithmetic.add(10, 20));
//        System.out.println(arithmetic.add(10.5, 20.7));
//        System.out.println(arithmetic.add(10, 20.5f));
//        System.out.println(arithmetic.subtract(10,5));
//        System.out.println(arithmetic.multiply(2,4));
//        System.out.println(arithmetic.divide(10,5));
//        System.out.println(arithmetic.getMin(3.3,3.6));
//        System.out.println(arithmetic.getMax(3.3,3.6));
    }
}
