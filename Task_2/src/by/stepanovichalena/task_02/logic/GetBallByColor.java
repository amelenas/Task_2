package by.stepanovichalena.task_02.logic;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.entity.Basket;

import java.util.ArrayList;

public class GetBallByColor {
    public ArrayList<Ball> getGetBallByColor(Basket basket, String color) {
        ArrayList<Ball> balls = new ArrayList<>();

        for (Ball ball : basket.getBasket()) {
            String ballColor = ball.getColor().trim().toLowerCase();
            if (ballColor.equals(color.trim().toLowerCase())) {
                balls.add(ball);
            }
        }
        return balls;
    }
}
