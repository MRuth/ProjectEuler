import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;

//===============================================================================
// Project : LargeSum.java
// Author  : Montana Ruth
// Date    : Jun 2, 2015
// Abstract: 
//===============================================================================

public class LargeSum
{
  public static void main(String[] args) throws IOException
  {
    BigInteger sum = BigInteger.valueOf(0);
    BufferedReader in = new BufferedReader(new FileReader("Files/largeSum.in"));
    String str;

    while ((str = in.readLine()) != null)
      {
        sum = sum.add(new BigInteger(str));
      }

    System.out.println(sum.toString().substring(0, 10));
    in.close();
  }
}
