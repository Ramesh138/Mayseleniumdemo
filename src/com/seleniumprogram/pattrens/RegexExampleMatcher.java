package com.seleniumprogram.pattrens;

import java.util.regex.*;  
public class RegexExampleMatcher{  
public static void main(String args[]){  
  String content = "ZZZ AA PP AA QQQ AAA ZZ";

  String string = "AA";
  Pattern pattern = Pattern.compile(string);
  Matcher matcher = pattern.matcher(content);

  while(matcher.find()) {
     System.out.println("Found at: "+ matcher.start()
    		+ 
    		" - " + matcher.end());
     
     System.out.println(content.substring(matcher.start(), matcher.end()));
  }
}
}
