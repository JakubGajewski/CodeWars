package pl._8kyu;

//The cockroach is one of the fastest insects. Write a function which takes its speed in km per hour and returns it in cm per second, rounded down to the integer (= floored).

public class Cockroach {
    public static int cockroachSpeed(double x){
        return (int)(x/0.036);
    }

}
