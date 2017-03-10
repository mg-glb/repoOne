package io.repoOne.moduleOne;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLClassLoader;

/**
 * @author m.gigena
 *
 */
public final class Main {

  /**
   * @author m.gigena
   */
  private Main() {
    throw new AssertionError();
  }

  /**
   * @author m.gigena
   * @param args arguments for this program
   * @throws MalformedURLException if jar loading fails
   */
  public static void main(final String[] args) throws MalformedURLException {
    System.out.println("Loading jar...");
    File jarFile = new File(System.getProperty("targetjar.path"));
    URLClassLoader loader = //
        new URLClassLoader(//
            new URL[] {jarFile.toURI().toURL()}, //
            System.class.getClassLoader()//
        );
    for (URL it : loader.getURLs()) {
      System.out.println(it.toString());
    }
    try {
      Class<?> clazz = Class.forName("io.repoTwo.HomePage", true, loader);
      System.out.println(clazz.getName());
    } catch (ClassNotFoundException exception) {
      exception.printStackTrace();
    }
  }
}
