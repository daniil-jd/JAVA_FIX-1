package ru.kai;

/**
 * 16.04.2018
 * MessagePrinterErrorOutImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessagePrinterErrorOutImpl implements MessagePrinter {
    private Message message;

    public MessagePrinterErrorOutImpl(Message message) {
        this.message = message;
    }

    public void print() {
        System.err.println(message.getText());
    }
}
