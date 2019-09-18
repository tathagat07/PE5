package com.stackroute;

import java.util.List;
import java.util.stream.Collectors;

public class UpperCaseLambdaStreamDemo {

    public static List<String> toUpperCase(List<String> list) {

      List<String> list1 = list.stream().map(String::toUpperCase).collect(Collectors.toList());
      return list1;
    }

}
