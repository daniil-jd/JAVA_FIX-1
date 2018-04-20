package ru.kai;

import java.time.LocalDateTime;

/**
 * 16.04.2018
 * CheckPrinterStandardImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CheckPrinterStandardImpl implements CheckPrinter {
    public void printCheck(int sum) {
        System.out.println("Check printed for " + sum + " at " + LocalDateTime.now());
    }
}
