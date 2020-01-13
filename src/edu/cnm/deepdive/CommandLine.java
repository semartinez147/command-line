package edu.cnm.deepdive;

public class CommandLine {

  public static void main(String[] args) {
    int[] vals = parse(args); //fill array "vals" from the "parse" method;
    int total = sum(vals); //add the items in "vals" from the "sum" method;
    System.out.println(total);
  }

  private static int[] parse(String[] args) { //the method is called "parse";
    int[] values = new int[args.length]; //declare array of ints named "values," make it as big as the number of arguments from the command line;
    for (int i = 0; i < args.length; i++) {
      values[i] = Integer.parseInt(args[i]); //turn arguments into integers and add them to the array "values";
    }
    return values;
  }
  private static int sum(int[] data) { //the method is called "sum";
    int total = 0;
    for (int i = 0; i < data.length; i++) {
      total += data[i]; //add element i (which increments) of the array data to total;
    }
    return total;
  }
}
