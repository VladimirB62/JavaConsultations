package model;

import inteface.Artist;
import inteface.Painter;
import myEnum.Color;

public class Rectangle extends Figure implements Artist, Painter {

    int width;
    int height;

    public Rectangle(char symbol, Color color, int width, int height) {
        super(symbol, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public double calculateArea(){
        System.out.println("Площадь прямоугольника " + width*height);
        return width*height;
    }



    @Override
    public void drawFigure() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Рисую прямоугольник");
        for (int i = 0; i < height; i++) {
            System.out.println();
            for (int j = 0; j <width ; j++) {
                System.out.print(super.getSymbol());
            }
        }
        System.out.println();
    }

    @Override
    public void paintFigure() {

    }
}
