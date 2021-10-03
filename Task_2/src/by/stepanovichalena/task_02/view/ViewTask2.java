package by.stepanovichalena.task_02.view;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.entity.Basket;
import by.stepanovichalena.task_02.logic.GetBallByColor;
import by.stepanovichalena.task_02.logic.GetSumOfArray;

import java.util.ArrayList;
import java.util.Collections;

public class ViewTask2 {
    public static void main(String[] args) {
        Basket basket = new Basket();
        GetBallByColor getBallByColor = new GetBallByColor();
        GetSumOfArray getSumOfArray = new GetSumOfArray();

        ArrayList<Ball> balls = new ArrayList<>();

        balls.add(new Ball(2.5, "Blue"));
        balls.add(new Ball(2.3, "Blue"));
        balls.add(new Ball(0.3, "Red"));
        balls.add(new Ball(1.0, "Green"));
        balls.add(new Ball(0.9, "Yellow"));
        balls.add(new Ball(2.1, "Blue"));

        basket.setBasket(balls);
        ArrayList<Ball> blueBalls = new ArrayList<>(getBallByColor.getGetBallByColor(basket, "blue"));
        System.out.println(blueBalls.size() + " blue balls in the basket");
        System.out.println("The weight of all balls is " + getSumOfArray.getSum(balls) + " kg");
        System.out.println("The weight of blue balls is " + getSumOfArray.getSum(blueBalls) + " kg");

        Collections.sort(balls);
        System.out.println(balls);
    }
}
