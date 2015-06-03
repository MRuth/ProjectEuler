//===============================================================================
// Project : SmallestMultiple.java
// Author  : Montana Ruth
// Date    : Jun 2, 2015
// Abstract: 
//===============================================================================

public class SmallestMultiple
{
  public static void main(String[] args)
  {
    long start = System.currentTimeMillis();

    int target = 20;
    long current = 2520;
    boolean found = false;

    while (!found)
      {
        boolean isMultiple = true;
        for (int i = 2; i <= target; i++)
          if (current % i != 0)
            {
              isMultiple = false;
              break;
            }
        if (isMultiple)
          found = true;
        else
          current += target;
      }
    long end = System.currentTimeMillis();
    System.out.println(current);
    System.out.println(end - start);
  }
}