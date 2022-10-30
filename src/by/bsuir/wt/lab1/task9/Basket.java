package by.bsuir.wt.lab1.task9;

import java.util.ArrayList;
import java.util.Iterator;

public class Basket {
    private ArrayList<Ball> balls = new ArrayList();

    public Basket() {
    }

    public void addBall(double weight, Color color) {
        this.balls.add(new Ball(weight, color));
    }

    public double getWeight() {
        double totalWeight = 0.0;

        Ball ball;
        for(Iterator var3 = this.balls.iterator(); var3.hasNext(); totalWeight += ball.returnBallWeight()) {
            ball = (Ball)var3.next();
        }

        return totalWeight;
    }

    public int getNumColoredBalls(Color color) {
        int totalNumber = 0;
        Iterator var3 = this.balls.iterator();

        while(var3.hasNext()) {
            Ball ball = (Ball)var3.next();
            if (ball.returnBallColor() == color) {
                ++totalNumber;
            }
        }

        return totalNumber;
    }
}

