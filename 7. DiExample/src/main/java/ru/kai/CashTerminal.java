package ru.kai;

/**
 * 16.04.2018
 * CashTerminal
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class CashTerminal {
    private int cash;
    private CheckPrinter printer;

    public CashTerminal(int cash, CheckPrinter printer) {
        this.cash = cash;
        this.printer = printer;
    }

    public void giveMoney(int sum) {
        if (cash >= sum) {
            cash = cash - sum;
            printer.printCheck(sum);
        }
    }

}
