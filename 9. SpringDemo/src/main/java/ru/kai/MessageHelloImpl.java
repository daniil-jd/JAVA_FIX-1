package ru.kai;

/**
 * 16.04.2018
 * MessageHelloImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessageHelloImpl implements Message {
    private String text;

    public MessageHelloImpl(String text) {
        this.text = "Hello, " + text;
    }

    public String getText() {
        return text;
    }
}
