/* public class Assignment_2 {

    // Day 8 - Intro to Java Assignment 2

//    // 1. For the exercises in the main() class from last time, create separate methods for each, still in the Main.java class, and then call them in the main() method.

    public static void main(String[] args) {

        printMyName();
        printSum();
        divideNumbers();
        printResults();

    }

    public static void printMyName(){
        System.out.println("Hello");
        System.out.println("Bianca");
    }

    public static void printSum() {
        int x = 2;
        int y = 3;
        System.out.println(x + y);
    }

    public static void divideNumbers() {
        int x = 10;
        int y = 3;
        float result = (float) x / y;
        System.out.println(result);
    }

    public static void printResults() {
        // a.
        System.out.println("a." + (-5 +(8 * 6)));
        // b.
        System.out.println("b." + ((55 + 9) % 9));
        // c.
        float result_c = 20 + (float) ((-3) * 5) / 8;
        System.out.println("c." + result_c);
        // d.
        float result_d = 5 + (float) 15 / 3 * 2 - 8 % 3;
        System.out.println("d." + result_d);
    }

    // 2.Write a Java method for each of the following mathematical operations: addition, subtraction, multiplication, and division.

    public static void main(String[] args) {

        System.out.println("Rezultatul adunarii este: " + adunare(2,3));
        System.out.println("Rezultatul scaderii este: " + scadere(5,1));
        System.out.println("Rezultatul inmultirii este: " + inmultire(5,8));
        System.out.println("Rezultatul impartirii este: " + impartire(14,3));
    }

    public static int adunare(int primulNumar, int alDoileaNumar){
        int rezultat_adunare = primulNumar + alDoileaNumar;
        return rezultat_adunare;
    }

    public static int scadere(int primulNumar, int alDoileaNumar){
        int rezultat_scadere = primulNumar - alDoileaNumar;
        return rezultat_scadere;
    }

    public static int inmultire(int primulNumar, int alDoileaNumar){
        int rezultat_inmultire = primulNumar * alDoileaNumar;
        return rezultat_inmultire;
    }

    public static float impartire(float primulNumar, float alDoileaNumar){
        float rezultat_impartire = primulNumar / alDoileaNumar;
        return rezultat_impartire;
    }

    // 3. Write a Java method that takes 3 number parameters and returns the average of the numbers.
    public static void main(String[] args) {
        System.out.println(average(2,3,4));
    }

    public static int average(int firstNumber, int secondNumber, int thirdNumber){
        int res = firstNumber * secondNumber * thirdNumber;
        return res;
    }

    // 4. Write a Java method that returns the remainder of the division of two numbers.
    public static void main(String[] args) {
        System.out.println(remainder(5,4));
    }

    public static int remainder(int firstNumber, int secondNumber){
        int res = firstNumber % secondNumber;
        return res;
    }

    // 5. Write a Java method that takes a number parameter representing the temperature in Fahrenheit, and returns the temperature in Celsius.
    // The conversion formula is: C = 5/9 * (F - 32)

    public static void main(String[] args) {
        System.out.println("Temperature in Celsius is: " + temperature_conversion(100));
    }

    public static float temperature_conversion(float temperatureInFahrenheit){
        float temperatureInCelsius = (float) 5 /9 * (temperatureInFahrenheit - 32);
        return temperatureInCelsius;
    }

    // 6. Write a Java method that takes a real number parameter representing the distance in inches, and returns the distance in meters.

    public static void main(String[] args) {
        System.out.println("Distance in mteres is: " + distance_conversion( 20));
    }

    public static float distance_conversion(float distanceInInches){
        float distanceInMeters = (float) (distanceInInches * 0.0254);
        return distanceInMeters;
    }

    // 7. Write a Java method that takes the distance (in meters) and the time (as 3 numbers: hours, minutes, seconds),
    // and displays the speed in meters per second, kilometers per hour, and miles per hour. (Hint: 1 mile = 1609 meters)

    public static void main(String[] args) {
        System.out.println("Speed in meters per second: " + speedInMetersPerSeconds(50, 2,30, 60));
        System.out.println("Speed in kilometers per hour: " + speedInKmPerHours(50, 2,30, 60));
        System.out.println("Speed in miles per hour: " + speedInMilesPerHour(50, 2,30, 60));
    }

    // calculate speed in meters per second
    public static float speedInMetersPerSeconds(float distance, int hours, int minutes, int seconds){
        int totalSeconds = ((hours * 60) * 60) + (minutes * 60) + seconds;
        return distance / totalSeconds;
    }

    // calculate speed in kilometers per hour
    public static float speedInKmPerHours(float distance, int hours, int minutes, int seconds){
        float distanceInKms = distance / 1000;
        float totalHours = (float) (((hours * 60) * 60) + (minutes * 60) + seconds) / 3600;
        return distanceInKms / totalHours;
    }

    // calculate speed in miles per hour
    public static float speedInMilesPerHour(float distance, int hours, int minutes, int seconds){
        float distanceInMiles = distance / 1609;
        float totalHours = (float) ((((hours * 60) * 60) + (minutes * 60) + seconds) / 3600);
        return  distanceInMiles / totalHours;
    }

    // 8. Write a program that takes the radius of a circle as input and prints the perimeter and area of that circle.


    public static void main(String[] args) {
        System.out.println("Perimeter: " + calculatePerimeter(10));
        System.out.println("Area: " + calculateArea(10));

    }

    public static float calculatePerimeter(float radius){
        float pi = 3.14f;
        return 2 * pi * radius;
    }

    public static float calculateArea(float radius){
        float pi = 3.14f;
        return pi * radius * radius;
    }



    }


*/
