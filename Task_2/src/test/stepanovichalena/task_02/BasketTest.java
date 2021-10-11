package test.stepanovichalena.task_02;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.entity.Basket;
import by.stepanovichalena.task_02.exception.BasketBallException;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class BasketTest {
    private Basket basket = new Basket();
    private ArrayList<Ball> balls = new ArrayList<>();

    @Before
    public void init() throws BasketBallException {
        balls.add(new Ball(0.5, "Blue"));
        balls.add(new Ball(0.3, "Blue"));
        balls.add(new Ball(0.2, "Red"));
        balls.add(new Ball(0.1, "Green"));
        balls.add(new Ball(0.09, "Yellow"));
        balls.add(new Ball(0.10, "Yellow"));
        balls.add(new Ball(0.12, "Blue"));
        basket.setBasket(balls);
    }

    @Test (expected = BasketBallException.class)
    public void setNullParameters() throws BasketBallException {
        new Ball(0, null);
    }

    @Test
    public void setBasket() throws BasketBallException {
        basket.setBasket(balls);
    }

    @Test(expected = BasketBallException.class)
    public void setBasketNull() throws BasketBallException {
        basket.setBasket(null);
    }

    @Test
    public void addItem() throws BasketBallException {
        assertTrue(basket.addItem(new Ball(0.3, "Blue")));
    }

    @Test
    public void basketContains() throws BasketBallException {
        Ball ball = new Ball(0.5, "Blue");
        assertTrue(basket.basketContains(ball));
    }

    @Test
    public void removeBall() throws BasketBallException {
        Ball ball = new Ball(0.5, "Blue");
        assertTrue(basket.removeBall(ball));
    }

    @Test
    public void newBasketWithBallsByColor() throws BasketBallException {
        Basket basket2 = new Basket();
        basket2.setBasket(basket.ArrayOfBallsByColor("Blue"));
        Basket basket3 = new Basket();
        ArrayList<Ball> balls = new ArrayList<>();
        balls.add(new Ball(0.5, "Blue"));
        balls.add(new Ball(0.3, "Blue"));
        balls.add(new Ball(0.12, "Blue"));
        basket3.setBasket(balls);
        assertEquals(basket2, basket3);
    }

    @Test
    public void amountOfBallsByColor() {
        int expected = 2;
        int actual = basket.amountOfBallsByColor("Yellow");
        assertEquals(expected, actual);
    }

    @Test
    public void sumByColor() {
        double expected = 0.19;
        double actual = basket.sumByColor("Yellow");
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void sumOfBalls() {
        double expected = 1.41;
        double actual = basket.sumOfBalls();
        assertEquals(expected, actual, 0.01);
    }
}