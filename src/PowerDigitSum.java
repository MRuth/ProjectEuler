import java.math.BigInteger;
import java.util.Arrays;

//===============================================================================
// Project : PowerDigitSum.java
// Author  : Montana Ruth
// Date    : Jun 3, 2015
// Abstract: 
//===============================================================================

public class PowerDigitSum
{
  public static void main(String[] args)
  {
    int sum = Arrays.stream(BigInteger.valueOf(2).pow(1000).toString().split("")).mapToInt(Integer::valueOf).sum();
    System.out.println(sum);
  }
}