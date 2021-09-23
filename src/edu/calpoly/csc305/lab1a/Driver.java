package edu.calpoly.csc305.lab1a;

class Driver {
  public static void main(String[] args) {
    Example ex = new Example();
    int total = 0;
    int counter = 0;

    while (counter < ex.getNums().length) {
      int num = ex.getNums()[0];
      total += num;
      counter++;
    }
    System.out.println(ex.sameName("ha"));
    System.out.println(total);
  }
}

