package by.stepanovichalena.task_02.view;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.entity.Basket;
import by.stepanovichalena.task_02.exception.BasketBallException;

import java.util.ArrayList;

public class ViewTask2 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        ArrayList<Ball> balls = new ArrayList<>();

        try {
            balls.add(new Ball(0.5, "Blue"));
            balls.add(new Ball(0.3, "Blue"));
            balls.add(new Ball(0.2, "Red"));
            balls.add(new Ball(0.1, "Green"));
            balls.add(new Ball(0.09, "Yellow"));
            balls.add(new Ball(0.12, "Blue"));

            basket.setBasket(balls);
            System.out.println(basket.amountOfBallsByColor("Blue") + " blue balls in the basket");
            System.out.println("The weight of all balls is " + basket.sumOfBalls() + " g");
            System.out.println("The weight of blue balls is " + basket.sumByColor("Blue") + " g");

        } catch (BasketBallException ex) {
            ex.printStackTrace();
        }

    }
}
