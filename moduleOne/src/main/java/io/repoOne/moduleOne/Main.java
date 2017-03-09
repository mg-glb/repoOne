package io.repoOne.moduleOne;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

  public static void main(String[] args) throws MalformedURLException {
    System.out.println("Loading jar...");
    URLClassLoader loader = new URLClassLoader(
        new URL[] {new URL("file://C:/Users/m.gigena/.m2/repository/io/repoOne/moduleTwo/1.0-SNAPSHOT/moduleTwo-1.0-SNAPSHOT.jar")},
        Thread.currentThread().getContextClassLoader());
    for (URL it : loader.getURLs()) {
      System.out.println(it.toString());
    }
    try {
      Class clazz = Class.forName("io.repoOne.moduleTwo.BasePage", true, loader);
      System.out.println(clazz.getName());
    } catch (ClassNotFoundException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
  }
}
