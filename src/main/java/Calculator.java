public class Calculator {

    // 1
    public float divideNumbers(float firstNumber, float secondNumber) {
        return firstNumber / secondNumber;
    }

    public double divideNumbers(double firstNumber, double secondNumber) {
        return firstNumber / secondNumber;
    }

    // 2.1
    public int addTwoNumbers(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }

    // 2.2
    public double subtractTwoNumbers(double firstNumber, double secondNumber){
        return firstNumber - secondNumber;
    }

    // 2.3
    public  int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }

    // 2.4
    public float divide(float firstNumber, float secondNumber){
        return firstNumber / secondNumber;
    }

    // 3
    public float averageOfThreeNumbers(float firstNumber, float secondNumber, float thirdNumber) {
        return (firstNumber + secondNumber + thirdNumber) / 3;
    }

    // 4
    public int remainder(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }

    // 5
    public float fahrenheitToCelsius(float temperature){
        return (float) 5 /9 * (temperature - 32);
    }

    // 6
    public float inchesToMeters(float distance){
        return (float) (distance * 0.0254);
    }

    // 7
    public float speedInMetersPerSeconds(float distance, int hours, int minutes, int seconds){
        int totalSeconds = ((hours * 60) * 60) + (minutes * 60) + seconds;
        return distance / totalSeconds;
    }

    public float speedInKmPerHours(float distance, int hours, int minutes, int seconds){
        float distanceInKms = distance / 1000;
        float totalHours = (float) (((hours * 60) * 60) + (minutes * 60) + seconds) / 3600;
        return distanceInKms / totalHours;
    }

    public float speedInMilesPerHour(float distance, int hours, int minutes, int seconds){
        float distanceInMiles = distance / 1609;
        float totalHours = (float) ((((hours * 60) * 60) + (minutes * 60) + seconds) / 3600);
        return  distanceInMiles / totalHours;
    }

    // 8
    public float circlePerimeter(float radius){
        float pi = 3.14f;
        return 2 * pi * radius;
    }

    public float circleArea(float radius){
        float pi = 3.14f;
        return pi * radius * radius;
    }

    // Ex. 1 - Assignment - Arrays - overload all methods according to the principle of polymorphism
    // Create at least two polymorphic methods for each method in the class.













}
