package com.electricsheeplabs.electricsheep;

//~--- non-JDK imports --------------------------------------------------------

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

//~--- JDK imports ------------------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@SuppressWarnings("unused")
public class SelenPrompt {
  public static void main(String[] args) throws IOException {
      System.out.println("Selenium Shell 1.0.0");

      // System.out.println("Selenium Shell 1.0.0");
      System.out.println("Type 'help', 'copyright', 'credits' or 'license' for more information. ");

      int loop = 0;

      do {
          System.out.print("Selenium:>");

          // String input=System.console().readLine().trim();
          //WebDriver browsers = null;
          WebDriver browsers = new SafariDriver();
          //groovy.util.Eval.me("WebDriver browsers = null");

          BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          String sInput = br.readLine().trim();

          System.out.println("Your entered: " + sInput);

          if (sInput.equalsIgnoreCase("ff")) {
        	  groovy.util.Eval.me("browsers = new FirefoxDriver()");
          } else if (sInput.equalsIgnoreCase("sa")) {
              groovy.util.Eval.me("browsers = new SafariDriver()");
          } else if (sInput.equalsIgnoreCase("q")) {
              groovy.util.Eval.me("browsers.close()");
              System.out.println("Quitting...");
          } else {
              groovy.util.Eval.me(sInput);
          }
      } while (loop < 20);

//    try{
//        int i = Integer.parseInt(br.readLine());
//    }catch(NumberFormatException nfe){
//        System.err.println("Invalid Format!");
//    }
//          
//          
//          
//             do{
//                   System.out.print("value of x : " + x );
//                   x++;
//                   System.out.print("\n");
//                }while( x < 20 );
      // dr.get("http://google.com");
  }
}

//
//run do
//      loop do
//        print '>> '
//        input = gets.chomp
//        if input == 'q'
//          puts 'Quitting...'
//          @driver.quit
//          exit 0
//        end
//        begin
//          eval input
//        rescue Exception => e
//          puts e.message
//        end
//      end
//    end


//~ Formatted by Jindent --- http://www.jindent.com
