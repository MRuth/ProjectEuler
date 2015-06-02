//===============================================================================
// Project : EvenFibonacci.java
// Author  : Montana Ruth
// Date    : Jun 2, 2015
// Abstract: 
//===============================================================================

public class EvenFibonacci
{
  public static void main(String[] args)
  {
    int fib1 = 1;
    int fib2 = 1;
    int temp = 0;
    int evenFibSum = 0;

    while (fib2 < 4000000)
      {
        temp = fib2;
        fib2 = fib1 + fib2;
        fib1 = temp;
        evenFibSum += ((fib1 % 2 == 0) ? fib1 : 0);
        System.out.print(fib1 + ",");
      }
    System.out.println();
    System.out.println(evenFibSum);
  }
}
