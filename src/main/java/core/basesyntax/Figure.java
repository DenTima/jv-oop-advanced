package core.basesyntax;

public abstract class Figure implements DrawFigure, AreaCalculator {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure{"
                + "color='"
                + color
                + '\''
                + '}';
    }
}
