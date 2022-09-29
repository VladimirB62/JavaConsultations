package App;

import model.Figure;
import model.Rectangle;
import model.Square;
import model.Triangle;
import myEnum.Color;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Rectangle rectangle1 = new Rectangle('*', Color.RED, 6, 2);
        Rectangle rectangle2 = new Rectangle('^', Color.WHITE, 7, 5);
        Triangle triangle1 = new Triangle('$', Color.RED, 5, 6);
        Triangle triangle2 = new Triangle('#', Color.BLACK, 8, 3);
        Square square1 = new Square('!', Color.BLACK, 5);
        Square square2 = new Square('%', Color.RED, 6);


        rectangle1.calculateArea();
        square1.calculateArea();
        triangle1.calculateArea();

        Figure figure = new Rectangle('*', Color.RED, 6, 7);

        figure.calculateArea();

        Figure[] figures = new Figure[6];
        figures[0] = rectangle1;
        figures[1] = rectangle2;
        figures[2] = square1;
        figures[3] = square2;
        figures[4] = triangle1;
        figures[5] = triangle2;

        for (int i = 0; i < figures.length; i++) {
            figures[i].calculateArea();
        }

        List<Figure> figureList = Arrays.asList(figures);

        rectangle1.drawFigure();
        triangle1.drawFigure();

        System.out.println("***********************************************************************");
        Collections.sort(figureList, new FigureBySguareComporator());
        System.out.println(figureList.toString());
    }
}