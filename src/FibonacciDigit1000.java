import java.math.BigInteger;

//===============================================================================
// Project : FibonacciDigit1000.java
// Author  : Montana Ruth
// Date    : Jun 12, 2015
// Abstract: 
//===============================================================================

public class FibonacciDigit1000
{
  public static void main(String[] args)
  {
    long start = System.currentTimeMillis();
    BigInteger fib1 = BigInteger.ONE;
    BigInteger fib2 = BigInteger.ONE;
    BigInteger tempFib = BigInteger.ZERO;
    BigInteger index = BigInteger.valueOf(2);

    while (fib2.toString().length() < 1000)
      {
        tempFib = fib1.add(fib2);
        fib1 = fib2;
        fib2 = tempFib;
        index = index.add(BigInteger.valueOf(1));
      }
    long end = System.currentTimeMillis();
    System.out.println(index);
    System.out.println(end - start);
  }
}
