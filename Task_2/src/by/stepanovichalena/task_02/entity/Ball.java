package by.stepanovichalena.task_02.entity;


import java.io.Serial;
import java.io.Serializable;

public class Ball implements Serializable, Comparable<Ball> {
    @Serial
    private static final long serialVersionUID = 123546564656889L;

    private Double weight;
    private String color;

    public Ball() {
    }

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
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
        result = prime * result + weight.hashCode();
        result = prime * result + color.hashCode();
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
