package ru.kai;

/**
 * 16.04.2018
 * MessagePrinterStandardImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessagePrinterStandardImpl implements MessagePrinter {
    private Message message;

    public MessagePrinterStandardImpl(Message message) {
        this.message = message;
    }

    public void print() {
        System.out.println(message.getText());
    }
}
