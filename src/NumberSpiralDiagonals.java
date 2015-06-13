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
    long lastNum = 1;
    long sum = 1;
    long step = 2;
    long max = 1001 * 1001;

    while (lastNum < max)
      {
        for (int i = 0; i < 4; i++)
          {
            lastNum += step;
            sum += lastNum;
          }
        step += 2;
      }
    System.out.println(sum);
  }
}