/*
 * Copyright (C) 2017 guoh.io. All rights reserved.
 */
package com.guoh.java7.JavaProgrammingLanguage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * TODO: DOCUMENT ME!
 * 
 * @author guoh.mao
 */
public class TypeInferenceForGenericInstanceCreation {
  Map<String, List<String>> myMap = new HashMap<String, List<String>>();

  // java7
  Map<String, List<String>> myMap2 = new HashMap<>();


  Map<String, List<String>> myMap3 = new HashMap(); // unchecked conversion warning


  public void testGeneric() {
    List<String> list = new ArrayList<>();
    list.add("A");

    // The following statement should fail since addAll expects
    // Collection<? extends String>

    list.addAll(new ArrayList<>());

  }



}
