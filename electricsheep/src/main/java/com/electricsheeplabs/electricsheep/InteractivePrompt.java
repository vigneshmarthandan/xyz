package com.electricsheeplabs.electricsheep;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Scanner;

public class InteractivePrompt {

    public static void main(String[] args) {
    	
    	
    	//gnu.jel.CompiledExpression expr = null;

    	// constant expression
    	//expr=gnu.jel.Evaluator.compile();
    	//System.out.println("2*2="+expr.evaluate(context));
    	
        //WebDriver driver = getDriver();
    	System.out.print("Selenium1:>");
    	WebDriver driver = new SafariDriver();
    	System.out.print("Selenium:>");
        while (true) {
            String userInput = readUserInput();
            if (userInput.toLowerCase().equals("q")) {
                System.out.println("Quitting...");
                driver.quit();
                System.exit(0);
            }else {
                //groovy.util.Eval.me(userInput);
            	//expr.evaluate(userInput);
            }
            
        }
    }

    @SuppressWarnings("unused")
	private static WebDriver getDriver() {
        return new FirefoxDriver();
    }

    private static String readUserInput() {
        @SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }
}