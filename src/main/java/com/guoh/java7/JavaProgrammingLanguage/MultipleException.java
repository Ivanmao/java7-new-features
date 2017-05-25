/*
 * Copyright (C) 2017 guoh.io. All rights reserved.
 */
package com.guoh.java7.JavaProgrammingLanguage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.SQLException;

/**
 * TODO: DOCUMENT ME!
 * 
 * @author guoh.mao
 */
public class MultipleException {

  public void testException() {
    try {
      File file = new File("test.md");
      InputStream in = new FileInputStream(file);
      in.read();

    } catch (IOException ex) {
      // throw ex;
    } catch (Exception ex) {
      // throw ex;
    }
  }


  public void testMultipleException() {
    try {
      File file = new File("test.md");
      InputStream in = new FileInputStream(file);
      in.read();

    } catch (IOException | SQLException e) {
      // throw ex;
    }
  }


  
  //-------------------分隔线java7----------------------

  static class FirstException extends Exception {
  }
  static class SecondException extends Exception {
  }

  public void rethrowException(String exceptionName) throws Exception {
    try {
      if (exceptionName.equals("First")) {
        throw new FirstException();
      } else {
        throw new SecondException();
      }
    } catch (Exception e) {
      throw e;
    }
  }
  
  
  public void rethrowException2(String exceptionName) throws FirstException, SecondException {
    try {
      // ...
    } catch (Exception e) {
      throw e;
    }
  }



}
