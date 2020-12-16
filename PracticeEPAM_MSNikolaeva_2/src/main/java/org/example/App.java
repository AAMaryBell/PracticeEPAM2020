package org.example;

import org.apache.log4j.Logger;

/**
 * Задание второго дня производственной практики 16.12.2020
 * Николаева Мария, ТвГУ, ПМиК, 46 группа (ФИиИТ).
 */
public class App {

    private static Logger logger = Logger.getLogger(App.class);

    public static void main( String[] args ) {

        System.out.println("Hello! You`re about to see some weird string now... ");
        logger.info("I`m example info; we are starting to run code here!");
        for (int number = 1; number <= 100; number++) {
            /*if (number % 3 == 0) {
                if (number % 5 == 0) System.out.print("FizzBuzz ");
                else System.out.print("Fizz ");
            }
            else if (number % 5 == 0) System.out.print("Buzz ");
            */
            if (number % 3 == 0) System.out.print("Fizz");
            if (number % 5 == 0) System.out.print("Buzz");
        }
        logger.info("I`m another example info; code did some work.");
    }
}
