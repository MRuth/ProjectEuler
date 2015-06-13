import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

//===============================================================================
// Project : NameScores.java
// Author  : Montana Ruth
// Date    : Jun 8, 2015
// Abstract: 
//===============================================================================

public class NameScores
{
  public static void main(String[] args) throws IOException
  {
    BufferedReader fileIn = new BufferedReader(new FileReader("Files/names.txt"));
    ArrayList<String> names = new ArrayList<String>();
    long nameScore = 0;
    String inStr;

    while ((inStr = fileIn.readLine()) != null)
      {
        String[] inNames = inStr.replaceAll("\"", "").split(",");

        for (String inName : inNames)
          names.add(inName);
      }

    Collections.sort(names);

    for (int i = 0; i < names.size(); i++)
      {
        int nameSum = 0;

        for (char c : names.get(i).toLowerCase().toCharArray())
          nameSum += (c - 96);

        nameScore += nameSum * (i + 1);
      }

    System.out.println(nameScore);
    fileIn.close();
  }
}