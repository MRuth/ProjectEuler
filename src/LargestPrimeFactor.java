//===============================================================================
// Project : LargestPrimeFactor.java
// Author  : Montana Ruth
// Date    : Jun 2, 2015
// Abstract: 
//===============================================================================

public class LargestPrimeFactor
{
  public static void main(String[] args)
  {
    long target = 600851475143L;
    long largestPrimeFactor = 0;
    long sqrtTarget = (long) Math.sqrt(target) + 1;
    for (long i = 2L; i <= sqrtTarget; i++)
      {
        if (target % i == 0)
          {
            largestPrimeFactor = (isPrime(i) ? i : largestPrimeFactor);
          }
      }

    System.out.println(largestPrimeFactor);
  }

  public static boolean isPrime(long num)
  {
    long sqrtNum = (long) Math.sqrt(num) + 1;

    for (long i = 2L; i <= sqrtNum; i++)
      if (num % i == 0)
        return false;

    return true;
  }
}
