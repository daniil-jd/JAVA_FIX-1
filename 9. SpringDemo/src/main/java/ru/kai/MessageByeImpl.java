package ru.kai;

/**
 * 16.04.2018
 * MessageByeImpl
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class MessageByeImpl implements Message {
    private String text;

    public MessageByeImpl(String text) {
        this.text = "Bye, " + text;
    }

    public String getText() {
        return text;
    }
}
