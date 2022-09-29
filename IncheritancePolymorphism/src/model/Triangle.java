package model;

import inteface.Artist;
import myEnum.Color;

public class Triangle extends Figure implements Artist {

    int base;
    int height;

    public Triangle(char symbol, Color color, int base, int height) {

        super(symbol, color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea() {
        System.out.println("Площадь треугольника " + (double) base * height / 2);
        return (double) base * height / 2;
    }


    /**
     * method compiled by xeniaBch
     */
    @Override
    public void drawFigure() {
        System.out.println("--------------------------------------------------------------");
        for (int i = 1, j = 1; i <= this.height; i++, j += 2) {
            for (int space = this.height; space > i; space--)
                System.out.print(" ");
            for (int x = 1; x <= j; x++)
                System.out.print("*");
            System.out.println();
        }
    }
}






