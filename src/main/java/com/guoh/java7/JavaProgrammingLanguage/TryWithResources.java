package com.guoh.java7.JavaProgrammingLanguage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


/**
 * 
 * @author mao_g
 *
 */
public class TryWithResources {
  
  /**
   * 
   * TODO: DOCUMENT ME!
   * 
   * @author guoh.mao
   * @category readFirstLineFromFile
   * @param path
   * @return
   * @throws IOException
   */
  static String readFirstLineFromFile(String path) throws IOException {
    try (BufferedReader br = new BufferedReader(new FileReader(path))) {
      return br.readLine();
    }
  }

}
