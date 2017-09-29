package edu.cnm.deepdive.io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class File {

  private static final String FILENAME ="largest-product-data.txt";

  public static String[] getLines(String filename) throws IOException {
    List<String> lines = Files.readAllLines(Paths.get(filename));
    return lines.toArray(new String[0]);
  }

  public static void main(String[] args) {
    try {
      for (String line : getLines(FILENAME)) {
        System.out.println(line);
      }
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}