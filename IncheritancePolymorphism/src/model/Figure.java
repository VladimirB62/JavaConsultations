package model;

import myEnum.Color;

public abstract class Figure {

    private char symbol;
    private Color color;

    public Figure(char symbol, Color color) {
        this.symbol = symbol;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "symbol=" + symbol +
                ", color=" + color +
                "  " + calculateArea() +
                '}';
    }

    public char getSymbol() {
        return symbol;
    }

    public void setSymbol(char symbol) {
        this.symbol = symbol;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double calculateArea(){
        System.out.println("Я считаю площадь фигуры");
        return 0;
    }

}
