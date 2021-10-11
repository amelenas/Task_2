package by.stepanovichalena.task_02.view;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.entity.Basket;
import by.stepanovichalena.task_02.entity.Colors;
import by.stepanovichalena.task_02.exception.BasketBallException;
import by.stepanovichalena.task_02.reader.ConsoleReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ViewTask {
    public static void main(String[] args) {
        ConsoleReader consoleReader = new ConsoleReader();

        Basket basket = new Basket();

        ArrayList<Ball> balls = new ArrayList<>();
        ArrayList<Double> weights = new ArrayList<>();
        ArrayList<String> colors = new ArrayList<>();
        List<Colors> colorsToCheck = Arrays.asList(Colors.values());

        while (true) {
            System.out.println("Please input the weight and color. To exit, input \"exit\"");
            String value = consoleReader.readString().toUpperCase().trim();
            if (value.equals("EXIT")) {
                break;
            }
            double weight;
            String color;
            try {
                weight = Double.parseDouble(value);
                if (weight <= 0) {
                    throw new BasketBallException("The weight cannot be less than or equal to 0!");
                }
                weights.add(weight);
                System.out.println("Weight added.");
            } catch (NumberFormatException e) {
                try {
                    if (colorsToCheck.contains(Colors.valueOf(value))) {
                        color = value;
                        colors.add(color);
                        System.out.println("Color added.");
                    }
                } catch (IllegalArgumentException ex) {
                    System.out.println("This color is not available, the list of available colors:" + colorsToCheck);
                }
            } catch (BasketBallException be) {
                be.printStackTrace();
            }
        }

        try {
            int size = Math.min(weights.size(), colors.size());
            for (int i = 0; i < size; i++) {
                balls.add(new Ball(weights.get(i), colors.get(i)));
            }
            basket.setBasket(balls);
        } catch (BasketBallException e) {
            e.printStackTrace();
        }

        System.out.println(basket.amountOfBallsByColor("Blue") + " blue balls in the basket");
        System.out.println("The weight of all balls is " + basket.sumOfBalls() + " g");
        System.out.println("The weight of blue balls is " + basket.sumByColor("Blue") + " g");

        Collections.sort(balls);
        System.out.println(balls);
    }
}

