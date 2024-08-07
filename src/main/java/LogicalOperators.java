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
        System.out.println(0);
        System.out.println(1);
        int i = 1;
        int t1 = 0;
        int t2 = i;
        int count = 0;
        while (count < 18) {
            int t3 = t1 + t2;
            System.out.println(t3);
            t1 = t2;
            t2 = t3;
            i++;
            count++;
        }
    }

    // 10.
    public void cozaLozaWoza(){
        int i = 1;
        int count = 0;
        while(i <= 110){

            if (count % 11 == 0) {
                System.out.println("");
            }

            if (i != 1 && count % 3 == 0 && count % 5 == 0 && count % 7 == 0) {
                System.out.print("CozaLozaWoza ");
            } else if (i % 3 == 0 && i % 5 == 0) {
                System.out.print("CozaLoza ");
            } else if (i % 3 == 0 && i % 7 == 0) {
                System.out.print("CozaWoza ");
            } else if (i % 5 == 0 && i % 7 == 0) {
                System.out.print("WozaLoza ");
            }  else if (i % 3 == 0) {
                System.out.print("Coza ");
            } else if (i % 5 == 0) {
                System.out.print("Loza ");
            } else if (i % 7 == 0) {
                System.out.print("Woza ");
            }
            else {
                System.out.print(i + " ");
            }

            count++;
            i++;
        }
    }

    // arrays
    // 2.

    public int[] populateArray(int length){
        int[] myArray = new int[length];
        for (int i = 0; i < length; i++) {
            myArray[i] = i + 1;
        }
        return myArray;
    }



    // 3.
    public int[] evenNumberArray(int[] array) {
        int j = 0;
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                array[j] = i;
                System.out.println(i);
                j++;
            }
        }
        return array;
    }

    // 4.

    public float calculateAverage(int[] array){
        int sum = 0;
        int count = 0;
        for(int i = 0; i < array.length; i++) {
            sum = sum + array[i];
            count = count + 1;
        }
        return (float) sum / count;
    }

    // 5.
    public boolean checkString(String[] array, String string){
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(string)) {
                return true;
            }
        }
        return false;
    }


    // 6.
    public int checkNumber(int[] array, int number){
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }

        }
        return -1;
    }

    // 7.
    public void displayPattern(String[] array) {
        for (int h = 0; h < 10; h++) {
            for (int i = 0; i < 10; i++) {
                System.out.print(array[i] + " ");
            }
            System.out.println(" " + '\n');
        }
    }

    // 8.
    public int[] checkAndReturnArray(int[] array, int number) {
        int[] newArray;
        if (checkNumber(array, number) >= 1){
            newArray = new int[array.length -1];
        } else {
            newArray = new int[array.length];
        }

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != number) {
                newArray[j] = array[i];
                j++;
            } else {
                continue;
            }
        }
        return newArray;
    }

    }





























