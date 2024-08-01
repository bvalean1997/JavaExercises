public class LogicalOperators {

// ------------------------------ IF - ELSE ------------------------------------------

    // 3.
    public int checkBiggerNumber(int number1, int number2) {
        if (number1 > number2) {
            return number1;
        } else if (number1 == number2) {
            return number2;
        } else {
            return number2;
        }
    }

    public int checkLowerNumber(int number1, int number2) {
        if (number1 < number2) {
            return number1;
        } else if (number1 == number2) {
            return number2;
        } else {
            return number2;
        }
    }

    // 4.
    public String checkString(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    // 5.
    public String checkTwoTypes(String text, int number) {
        if (text == "Evozon" && number <= 3) {
            return text + " " + number;
        } else {
            return number + " " + text;
        }
    }

    // 6.
    public String forecast(int number) {
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        } else {
            return "The forecast snow is(cm): " + number;
        }
    }

    // 7.
    public String compareNumber(int number) {
        if (number > 3 && number != 4) {
            return "The number is greater than 3 and not equal to 4";
        } else if (number == 4) {
            return "The number is equal to 4";
        } else if (number == 3) {
            return " ";
        } else {
            return "The number is lower than 3";
        }
    }

    // 8.
    public String printNumber(int number) {
        switch (number) {
            case 1:
                return "The number is 1!";
            case 2:
                return "The number is 2!";
            case 3:
                return "The number is 3!";
            case 4:
                return "The number is 4!";
            case 5:
                return "The number is 5!";
            case 6:
                return "The number is 6!";
            case 7:
                return "The number is 7!";
            case 8:
                return "The number is 8!";
            case 9:
                return "The number is 9!";
            case 10:
                return "The number is 10!";
            default:
                return "Invalid number";
        }
    }

    // 9.
    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 10.
    public boolean isEligibleToVote(int age) {
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

    // 11.
    public int higherNumberAmongThree(int number1, int number2, int number3) {
        if (number1 > number2 && number1 > number3) {
            return number1;
        } else if (number2 > number1 && number2 > number3) {
            return number2;

        } else {
            return number3;
        }
    }


    // -------------------------------------------- FOR LOOPS -------------------------------------------------


    // 1.
    public void countToHoundred(int number) {
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
    // 2.

    public void countToHoundredDescending(int number) {
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    // 3.

    public void countRange(int firstNumber, int secondNumber) {
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    // 4.

    public void checkAndCount(int firstNumber, int secondNumber) {
        int max;
        int min;
        if (firstNumber > secondNumber) {
            max = secondNumber;
            min = firstNumber;
        } else {
            min = firstNumber;
            max = secondNumber;
        }

        for (int i = min; i <= max; i++) {
            System.out.println(i);
        }
    }


    //  5.
    public void displayEvenNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }


    //  6.
    public void displayOddNumbers() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

    // 7.
    public int addNumbers(int number) {
        int sum = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
        }
        return sum;
    }

    // 8.
    public float average(int number) {
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++) {
            sum = sum + i;
            count = count + 1;
        }
        return (float) sum / count;
    }


    // 9.
    public void drawPattern() {
        for (int i = 7; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("");
        }
    }


    // --------------------------------------- WHILE LOOP ----------------------------------------------------------

    // 1.
    public void countdownHundred(int number) {
        int i = number;
        while (i >= 100) {
            System.out.println(i);
            i--;
        }
    }

    // 2.
    public void countdownHundredNegative(int number) {
        int i = number;
        while (i >= -100) {
            System.out.println(i);
            i--;
        }
    }

    // 3.
    public void countdownRange(int firstNumber, int secondNumber) {
        while (secondNumber <= firstNumber) {
            System.out.println(firstNumber);
            firstNumber--;
        }
    }

    // 4.
    public void countdownSmallerToBigger(int firstNumber, int secondNumber) {
        int max = checkBiggerNumber(firstNumber, secondNumber);
        int min = checkLowerNumber(firstNumber, secondNumber);
        while (min <= max) {
            System.out.println(min);
            min++;
        }
    }

    // 5.
    public void printHundredEvenNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // 6.
    public void printHundredOddNumbers() {
        int i = 1;
        while (i <= 100) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    // 7.
    public void addNumberRange() {
        int firstNumber = 111;
        int secondNumber = 8899;
        int sum = 0;
        int count = 0;
        while (firstNumber <= secondNumber) {
            sum = sum + firstNumber;
            count = count + 1;
            firstNumber++;
        }
        System.out.println("Sum: " + sum);
        double average = (double) sum / count;
        System.out.println("Average: " + average);

    }

    // 8.
    public double averageDivisibleNumbers(int firstNumber, int secondNumber) {
        int sum = 0;
        int count = 0;
        while (firstNumber <= secondNumber) {
            if (firstNumber % 7 == 0){
                sum = sum + firstNumber;
                count = count + 1;
            }
            firstNumber++;
        }
        return (float) sum / count;
    }


    // 9.
    public void fibonacciSequence(){
    int i = 0;
    while (i <= 20) {
        i = i + 1;
        System.out.println(i);
        i++;
    }
    }






















}




