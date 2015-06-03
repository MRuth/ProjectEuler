//===============================================================================
// Project : SummationOfPrimes.java
// Author  : Montana Ruth
// Date    : Jun 2, 2015
// Abstract: 
//===============================================================================

public class SummationOfPrimes
{
  public static void main(String[] args)
  {
    int[] primes = getPrimes(2000000);
    long sumPrimes = 0;
    for (int i : primes)
      sumPrimes += i;
    System.out.println(sumPrimes);
  }

  private static int[] getPrimes(int max)
  {
    boolean[] isComposite = new boolean[max + 1];
    for (int i = 2; i * i <= max; i++)
      {
        if (!isComposite[i])
          {
            for (int j = i; i * j <= max; j++)
              {
                isComposite[i * j] = true;
              }
          }
      }
    int numPrimes = 0;
    for (int i = 2; i <= max; i++)
      {
        if (!isComposite[i])
          numPrimes++;
      }
    int[] primes = new int[numPrimes];
    int index = 0;
    for (int i = 2; i <= max; i++)
      {
        if (!isComposite[i])
          primes[index++] = i;
      }
    return primes;
  }
}
