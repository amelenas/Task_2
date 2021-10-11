package test.stepanovichalena.task_02;

import by.stepanovichalena.task_02.entity.Ball;
import by.stepanovichalena.task_02.exception.BasketBallException;
import org.junit.Test;

import static org.junit.Assert.*;

public class BallTest {

    @Test
    public void getColor() throws BasketBallException {
        String expected = "Green";
        Ball ball = new Ball(0.17, "Green");
        assertEquals(expected, ball.getColor());
    }

    @Test
    public void getWeight() throws BasketBallException {
        double expected = 0.17;
        Ball ball = new Ball(expected, "Green");
        assertEquals(0.17, ball.getWeight(), 0.0);
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