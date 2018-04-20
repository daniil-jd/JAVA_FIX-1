package ru.kai;

/**
 * 16.04.2018
 * Main
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Main {
    public static void main(String[] args) {
        CheckPrinter printer = new CheckPrinterErrorOutImpl();
        CashTerminal terminal = new CashTerminal(100, printer);
        terminal.giveMoney(50);
    }
}
