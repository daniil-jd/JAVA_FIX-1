package ru.kai;

/**
 * 16.04.2018
 * CheckPrinterErrorOutImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CheckPrinterErrorOutImpl implements CheckPrinter {
    @Override
    public void printCheck(int sum) {
        System.err.println("MONEY LEFT");
    }
}
