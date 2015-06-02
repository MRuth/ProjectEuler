//===============================================================================
// Project : Multiples35.java
// Author  : Montana Ruth
// Date    : Jun 2, 2015
// Abstract: 
//===============================================================================

public class Multiples35
{
  public static void main(String[] args)
  {
    long sumMultiples35 = 0;

    for (int i = 1; i < 1000; i++)
      {
        sumMultiples35 += ((i % 3 == 0) || (i % 5 == 0) ? i : 0);
      }

    System.out.println(sumMultiples35);
  }
}
