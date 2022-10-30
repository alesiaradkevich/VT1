package by.bsuir.wt.lab1.task9;

public class Ball {
    private double weight;
    private Color color;

    public Ball(double weight, Color color) {
        this.color = color;
        this.weight = weight;
    }

    public double returnBallWeight() {
        return this.weight;
    }

    public Color returnBallColor() {
        return this.color;
    }
}
