import java.util.ArrayList;

public class recursion{

  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  public static double sqrt(double n, double tolerance){
    if (n == 0){
      return 0;
    }
    return rootHelp(n, tolerance, 1);
  }

  private static double rootHelp(double n, double tolerance, double guess){
    if (Math.abs(guess*guess - n) < n * tolerance){
      return guess;
    } else {
      guess = (n /guess + guess) / 2;
      return rootHelp(n, tolerance, guess);
    }
  }

  /*Recursively find the n'th fibbonaci number in linear time
     *fib(0) = 1; fib(1) = 1; fib(5) = 5
     *precondition: n is non-negative
     */
  public static int fib(int n){
    return fibHelp(n, 1, 0);
  }

  private static int fibHelp(int n, int curr, int prev){
    if (n < 2) {
      return curr;
    } else {
      return fibHelp(n-1, prev + curr, curr);
    }
  }

  public static ArrayList<Integer> makeAllSums(int n){
    ArrayList<Integer> sumList = new ArrayList<Integer>();
    allSumsHelp(n, 0, 0, sumList);
    return sumList;
  }

  public static void allSumsHelp(int n, int sum, int index, ArrayList<Integer> sumList){
    if (n == 0){
      System.out.println(sum);
      sumList.add(sum);
    }else{
      allSumsHelp(n-1, sum+n, index+1, sumList);
      allSumsHelp(n-1, sum, index+1, sumList);
    }
  }

  public static void main(String[] args){
    /*System.out.println(sqrt(4, 0.00001));
    System.out.println(sqrt(0.000000003, 0.00001));
    System.out.println(sqrt(4808788, 0.00001));
    System.out.println(sqrt(24, 0.00001));
    System.out.println(sqrt(12345.64, 0.00001));
    System.out.println(sqrt(0, 0.00001));
    System.out.println(fib(0));
    System.out.println(fib(1));
    System.out.println(fib(2));
    System.out.println(fib(3));
    System.out.println(fib(5));
    System.out.println(fib(60));*/
    //System.out.println(makeAllSums(0));
    //System.out.println(makeAllSums(1));
    //System.out.println(makeAllSums(2));
    //System.out.println(makeAllSums(3));
    System.out.println(makeAllSums(7));
  }
}
