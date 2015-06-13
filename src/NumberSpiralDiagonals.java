//===============================================================================
// Project : NumberSpiralDiagonals.java
// Author  : Montana Ruth
// Date    : Jun 13, 2015
// Abstract: 
//===============================================================================

public class NumberSpiralDiagonals
{
  public static void main(String[] args)
  {
    long sum = 1;

    for (int i = 3; i <= 1001; i += 2)
      {
        sum += ((4 * (i * i)) - (6 * i) + 6);
      }

    System.out.println(sum);

  }

}