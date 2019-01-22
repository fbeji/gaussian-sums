package edu.cnm.deepdive;

import java.util.Scanner;

public class Gauss {

  public static final int DEFAULT_UPPER_LIMIT = 100;

  public static void main(String[] args) {


    int upperLimit = DEFAULT_UPPER_LIMIT;

//    if (args.length > 0) {
//      upperLimit = Integer.parseInt(args[0]);
//    }

    Scanner scanner = new Scanner(System.in); // Create instance of scanner class, using System.in as source. if txt file = new Scanner (new File ("data.txt"))

    System.out.print("Enter upper limit: ");


    while ( scanner.hasNextInt()) {

      upperLimit = scanner.nextInt();
      long sum = triangleSum(upperLimit); // TODO Invoke triangleSum method.
      System.out.printf("Sum from 1 to %,d = %,d%n", upperLimit, sum);
      System.out.print("Upper Limit: ");


    }


  }

  public static long triangleSum(int upperLimit){
   // create a bucket for sum
   long sum = 0;
   for (int i = 1; i <= upperLimit; i++ ){
     sum += i;
   }
    return sum;
  }
}
