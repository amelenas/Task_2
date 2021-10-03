package by.stepanovichalena.task_02.logic;

import by.stepanovichalena.task_02.entity.Ball;

import java.util.ArrayList;


public class GetSumOfArray {
    public double getSum(ArrayList<Ball> list) {
        double sum = 0.0;
        for (Ball ball : list) {
            sum += ball.getWeight();
        }
        return sum;
    }
}
