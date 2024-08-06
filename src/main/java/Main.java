//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Assignment2 ex = new Assignment2();
//        ex.printMyName();
//        ex.printResults();
//        ex.facePattern();

        Calculator calc = new Calculator();
//        System.out.println(calc.divideNumbers(4, 6));
//        System.out.println(calc.addTwoNumbers(5,10));
//        System.out.println(calc.subtractTwoNumbers(10,5));
//        System.out.println(calc.multiply(5,5));
//        System.out.println(calc.divide(22, 11));
//        System.out.println(calc.averageOfThreeNumbers(3,3,3));
//        System.out.println(calc.remainder(5,2));
//        System.out.println(calc.fahrenheitToCelsius(100));
//        System.out.println(calc.inchesToMeters(20));
//        System.out.println(calc.speedInMetersPerSeconds(50,2,30,60));
//        System.out.println(calc.speedInKmPerHours(50,2,30,60));
//        System.out.println(calc.speedInMilesPerHour(50,2,30,60));
//        System.out.println(calc.circlePerimeter(10));
//        System.out.println(calc.circleArea(20));

        // polymorphism
//        System.out.println(calc.divideNumbers(12.5F, 4.6F));

        LogicalOperators op = new LogicalOperators();

        // if - else
//        System.out.println(op.checkBiggerNumber(5,3));
//        System.out.println(op.checkString("Evozon"));
//        System.out.println(op.checkTwoTypes("Evozon", 3));
//        System.out.println(op.forecast(7));
//        System.out.println(op.printNumber(11));
//        System.out.println(op.isNumberEven(4));
//        System.out.println(op.isEligibleToVote(4));
//        System.out.println(op.higherNumberFromThree(5,9,3));

        // for loops
//        op.countToHoundred(5);
//        op.countToHoundredDescending(0);
//        op.countRange(1,10);
//        op.checkAndCount(2, 7);
//        op.displayEvenNumbers();
//        op.displayOddNumbers();
//        System.out.println(op.addNumbers(1));
//        System.out.println(op.average(1));
//        op.drawPattern();

        // while loop
//    op.countdownHundred(110);
//    op.countdownHundredNegative(5);
//    op.countdownRange(20, 15);
//    op.countdownSmallerToBigger(2,10);
//    op.printHundredEvenNumbers();
//    op.printHundredOddNumbers();
//    op.addNumberRange();
//    System.out.println(op.averageDivisibleNumbers(7,14));
//        op.fibonacciSequence();
//    op.cozaLozaWoza();


        // arrays
        Print print = new Print();
        int[] myArray = op.populateArray(100);
//        print.printArray(myArray);

        int[] evenArray = new int[51];
//        op.evenNumberArray(evenArray);


        int[] averageArray = {1, 2, 3, 4};
//        System.out.println(op.calculateAverage(averageArray));

        String[] nameArray = {"A", "B", "C", "D", "E", "F"};
//        System.out.println(op.checkString(nameArray,"X" ));

        int[] arrayNumbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//        System.out.println(op.checkNumber(arrayNumbers, 10));
        //- - - - - - - - -
        String[] patternArray = new String[]{"-", "-", "-", "-", "-", "-", "-", "-", "-", "-", "-"};
        op.displayPattern(patternArray);

        int[] numberOfArrays = {1, 3, 3, 4, 5, 6, 7, 8, 9, 10};
//        print.printArray(op.checkAndReturnArray(numberOfArrays, 3));







    }
}