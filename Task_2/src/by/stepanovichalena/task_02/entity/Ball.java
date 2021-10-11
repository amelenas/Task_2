package by.stepanovichalena.task_02.entity;


import by.stepanovichalena.task_02.exception.BasketBallException;

import java.io.Serial;
import java.io.Serializable;

public class Ball implements Serializable, Comparable<Ball> {
    @Serial
    private static final long serialVersionUID = 123546564656889L;

    private final String message = "The weight cannot be less than or equal to 0!";

    private double weight;
    private String color;

    public Ball() {
    }

    public Ball(double weight, String color) throws BasketBallException {
        if (weight <= 0) {
            throw new BasketBallException(message);
        }
        if (color == null) {
            throw new BasketBallException("The color cannot be null!");
        }
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) throws BasketBallException {
        if (weight <= 0) {
            throw new BasketBallException(message);
        }
        this.weight = weight;
    }


    public void setColor(String color) throws BasketBallException {
        if (color == null) {
            throw new BasketBallException(message);
        }
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        if (this.getClass() != o.getClass()) return false;
        Ball ball1 = (Ball) o;
        return getWeight().equals(ball1.getWeight()) && getColor().equals(ball1.getColor());
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + Double.hashCode(weight);
        result = prime * result + ((color == null) ? 0 : color.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" +
                "weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compareTo(Ball o) {
        return getWeight().compareTo(o.getWeight());
    }

}
