package com.example.refactoringexample._01_method._06_split_temporary_variable;

public class After {

    private double primaryForce;
    private double mass;
    private int delay;
    private double secondaryForce;

    double getDistanceTravlled(int time) {
        double result;
        final double primaryAcc = primaryForce / mass; // 여기에 사용한 변수를
        int primaryTime = Math.min(time, delay);
        result = 0.5 * primaryAcc * primaryTime * primaryTime;
        int secondaryTime = time - delay;
        if (secondaryTime > 0) {
            double primaryVel = primaryAcc * delay;
            double secondaryAcc  = (primaryForce + secondaryForce) / mass; // 여기에서 같이 사용하고 있다.
            result += primaryVel * secondaryTime + 0.5 * secondaryAcc * secondaryTime * secondaryTime;
        }
        return result;
    }

}
