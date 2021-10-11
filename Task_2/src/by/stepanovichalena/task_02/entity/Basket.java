package by.stepanovichalena.task_02.entity;

import by.stepanovichalena.task_02.exception.BasketBallException;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Basket implements Serializable {
    @Serial
    private static final long serialVersionUID = 1022315599945478654L;
    private ArrayList<Ball> basket = new ArrayList<>();

    public Basket() {
    }

    public ArrayList<Ball> getBasket() {
        return basket;
    }


    public void setBasket(ArrayList<Ball> basket) throws BasketBallException {
        if (basket == null) {
            throw new BasketBallException("The basket can't be null");
        }
        this.basket = basket;
    }

    public boolean addItem(Ball ball) {
        basket.add(ball);
        return true;
    }

    public boolean basketContains(Ball ball) {
        boolean result = false;
        if (ball != null) {
            for (Ball s : getBasket()) {
                if (ball.equals(s)) {
                    result = true;
                }
            }
        }
        return result;
    }

    public boolean removeBall(Ball ball) {
        boolean result = false;
        if (ball != null) {
            int j;
            for (int i = 0; i < basket.size(); i++) {
                if (ball.equals(basket.get(i))) {
                    j = i;
                    basket.remove(j);
                    result = true;
                }
            }
        }
        return result;
    }

    public ArrayList<Ball> ArrayOfBallsByColor(String color) {
        ArrayList<Ball> balls = new ArrayList<>();
        for (Ball ball : basket) {
            String ballColor = ball.getColor().trim().toLowerCase();
            if (ballColor.equals(color.trim().toLowerCase())) {
                balls.add(ball);
            }
        }
        return balls;
    }

    public int amountOfBallsByColor(String color) {
        ArrayList<Ball> balls = ArrayOfBallsByColor(color);
        return balls.size();
    }

    public double sumByColor(String color) {
        ArrayList<Ball> balls = ArrayOfBallsByColor(color);
        return sum(balls);
    }

    public double sumOfBalls() {
        return sum(basket);
    }

    private double sum(ArrayList<Ball> a) {
        double sum = 0.0;
        for (Ball ball : a) {
            sum += ball.getWeight();
        }
        return sum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Basket basket1 = (Basket) o;
        return getBasket().equals(basket1.getBasket());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((basket == null) ? 0 : basket.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "basket=" + basket +
                '}';
    }
}
