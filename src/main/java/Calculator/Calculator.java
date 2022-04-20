package Calculator;

import java.util.*;
import java.lang.Math;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public class Calculator {
  Logger logger = LogManager.getLogger(Calculator.class);;

	public Calculator() {
    System.out.println("Welcome!");
  }

	public double root(double num) {
		logger.info("OUTPUT - " + Math.sqrt(num));
		return Math.sqrt(num);
	}

	public double factorial(int num) {
		if (num < 0)
    {
			return Double.NaN;
    }
		double fact_out = 1;
		for (int i = 1; i <= num; i++)
    {
			fact_out *= i;
    }
		logger.info("OUTPUT - " + fact_out);
		return fact_out;
	}

	public double log(double num) {
		logger.info("OUTPUT - " + Math.log(num));
		return Math.log(num);
	}

	public double power(double num, double exp) {
		logger.info("OUTPUT - " + Math.pow(num, exp));
		return Math.pow(num, exp);
	}

	public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    Calculator calculator = new Calculator();

    System.out.println("Enter 1 to get Square Root");
    System.out.println("Enter 2 to get Factorial");
    System.out.println("Enter 3 to get Logarithm");
    System.out.println("Enter 4 to get Power");

    int input = scanner.nextInt();

    if (input == 1) {
      System.out.println("Square Root output is : " + calculator.root(scanner.nextDouble()));
    } else if (input == 2) {
      System.out.println("Factorial output is : " + calculator.factorial(scanner.nextInt()));
    } else if (input == 3) {
      System.out.println("Logarithm output is : " + calculator.log(scanner.nextDouble()));
    } else if (input == 4) {
      System.out.println("Power function output is : " + calculator.power(scanner.nextDouble(), scanner.nextDouble()));
    } else {
      System.out.println("Invalid Input.");
    }
	}
}