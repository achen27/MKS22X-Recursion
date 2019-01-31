public class recursion{

  /*Recursively find the sqrt using Newton's approximation
     *tolerance is the allowed percent error the squared answer is away from n.
     *precondition: n is non-negative

    */
  public static double sqrt(double n, double tolerance){
    if (n == 0){
      return 0;
    }
    return rootHelp(n, 0.00001, 1);
  }

  private static double rootHelp(double n, double tolerance, double guess){
    if (Math.abs(guess*guess - n) < n * tolerance){
      return guess;
    } else {
      guess = (n /guess + guess) / 2;
      return rootHelp(n, guess);
    }
  }

  public static void main(String[] args){
    System.out.println(sqrt(4));
    System.out.println(sqrt(0.000000003));
    System.out.println(sqrt(4808788));
    System.out.println(sqrt(24));
    System.out.println(sqrt(12345.64));
    System.out.println(sqrt(0));
  }
}
