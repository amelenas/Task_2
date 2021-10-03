package by.stepanovichalena.task_02.entity;

import java.io.Serial;
import java.io.Serializable;
import java.util.ArrayList;

public class Basket implements Serializable {
    @Serial
    private static final long serialVersionUID = 1022315599945478654L;
    private ArrayList<Ball> basket;

    public Basket() {

    }

    public ArrayList<Ball> getBasket() {
        return basket;
    }

    public void setBasket(ArrayList<Ball> basket) {
        this.basket = basket;
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
