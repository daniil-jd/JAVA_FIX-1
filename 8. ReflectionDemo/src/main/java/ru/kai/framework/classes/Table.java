package ru.kai.framework.classes;

/**
 * 16.04.2018
 * Table
 *
 * @author Sidikov Marsel (First Software Engineering Platform)
 * @version v1.0
 */
public class Table {
    private String color;
    private int height;
    private boolean isBusy;

    public Table(String color, int height, boolean isBusy) {
        this.color = color;
        this.height = height;
        this.isBusy = isBusy;
    }

    public String getColor() {
        return color;
    }

    public int getHeight() {
        return height;
    }

    public boolean isBusy() {
        return isBusy;
    }

    @Override
    public String toString() {
        return "Table{" +
                "color='" + color + '\'' +
                ", height=" + height +
                ", isBusy=" + isBusy +
                '}';
    }
}
