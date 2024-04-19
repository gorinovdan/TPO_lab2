package org.example;

import org.example.functions.logarithmic.LogFunctionCalculator;

/**
 * Hello world!
 *
 */
public class Main
{
    public static void main( String[] args ) {
        for (int i = 1; i <= 20; i += 1) {
            System.out.printf("%s, %s\n", i*0.01, new LogFunctionCalculator().calculateValue(i*0.01, 1e-9));
        }
    }
}
