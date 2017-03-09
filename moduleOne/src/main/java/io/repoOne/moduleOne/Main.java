package io.repoOne.moduleOne;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

public class Main {

  public static void main(String[] args) throws MalformedURLException {
    System.out.println("Loading jar...");
    File f = new File(System.getProperty("targetjar.path"));
    URLClassLoader loader = new URLClassLoader(new URL[] {f.toURI().toURL()}, System.class.getClassLoader());
    for (URL it : loader.getURLs()) {
      System.out.println(it.toString());
    }
    try {
      Class<?> clazz = Class.forName("io.repoTwo.HomePage", true, loader);
      System.out.println(clazz.getName());
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
    }
  }
}
