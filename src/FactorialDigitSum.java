import java.math.BigInteger;
import java.util.Arrays;

//===============================================================================
// Project : FactorialDigitSum.java
// Author  : Montana Ruth
// Date    : Jun 8, 2015
// Abstract: 
//===============================================================================

public class FactorialDigitSum
{
  public static void main(String[] args)
  {
    BigInteger factorial = BigInteger.ONE;

    for (int i = 100; i > 0; i--)
      {
        factorial = factorial.multiply(BigInteger.valueOf(i));
      }

    long digitSum = Arrays.stream(factorial.toString().split("")).mapToInt(Integer::valueOf).sum();

    System.out.println(digitSum);
    System.out.println(factorial.toString());
  }
}