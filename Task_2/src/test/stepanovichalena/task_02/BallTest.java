package test.stepanovichalena.task_02;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.exception.BasketBallException;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {

    @Test
    public void getColor() throws BasketBallException {
        Ball ball = new Ball(0.17, "Green");
        assertTrue(ball.getColor().equals("Green"));
    }

    @Test
    public void getWeight() throws BasketBallException {
        Ball ball = new Ball(0.17, "Green");
        assertTrue(ball.getWeight().equals(0.17));
    }

    @Test (expected = BasketBallException.class)
    public void setWeight() throws BasketBallException {
        Ball ball = new Ball();
        ball.setWeight(0);
    }

    @Test (expected = BasketBallException.class)
    public void setColor() throws BasketBallException {
        Ball ball = new Ball();
        ball.setColor(null);
    }
}