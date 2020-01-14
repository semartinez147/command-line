package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CommandLine {

  public static void main(String[] args) {
    Double[] data = read();//string from the "read" method
    System.out.printf("Input values: %s%n", Arrays.toString(data));//turn the array to a string and print it
    double total = sum(data); //define the number "total" by running the "sum" method on "data"
    System.out.printf("Sum: %,.2f%n", total); //print sum formatted with 2 decimals and commas
  }

  private static int[] parse(String[] args) { //the method is called "parse";
    int[] values = new int[args.length]; //declare array of ints named "values," make it as big as the number of arguments from the command line;
    for (int i = 0; i < args.length; i++) {
      values[i] = Integer.parseInt(
          args[i]); //turn arguments from command line into integers and add them to the array "values";
    }
    return values;
  }

  private static double sum(Double[] data) { //the method is called "sum";
    double total = 0;
    for (int i = 0; i < data.length; i++) {
      total += data[i]; //add the (double) integer in position i (which increments) of the array data to total;
    }
    return total;
  }

  private static Double[] read() {
    Double[] data = null;
    Scanner scanner = new Scanner(
        System.in); //puts a Scanner in the stack, named "scanner," that refers to a Scanner object in the heap;
    List<Double> input = new LinkedList<>();//lists are helpful because they are indeterminate length, unlike arrays
    while (true) {
      try {
        input.add(scanner.nextDouble());//this is why the command prompt waits for input after running
      } catch (NoSuchElementException e) {
        break;
      }
    }
    data = input.toArray(new Double[0]);//the program will size the array itself
    return data;
  }
}
