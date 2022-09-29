package App;

import model.Figure;

import java.util.Comparator;

public class FigureBySguareComporator implements Comparator<Figure> {
    @Override
    public int compare(Figure o1, Figure o2) {
        return (int) (o1.calculateArea() - o2.calculateArea());
    }
}
