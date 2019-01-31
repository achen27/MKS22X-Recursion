public class recursion{
  public static double sqrt(double n){
    if (n == 0){
      return 0;
    }
    return rootHelp(n, 1);
  }

  public static double rootHelp(double n, double guess){
    if (Math.abs(guess*guess - n) < n * 0.00001){
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
