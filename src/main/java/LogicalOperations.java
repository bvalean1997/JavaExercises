public class LogicalOperations {

// 4. Create a String method that takes a String parameter.
// Check if the text that comes as a parameter equals "Evozon".
// If yes, then the method should return "Learning text comparison".
// If not, the method should return "Got to try some more".

    public String checkString(String text) {
        if (text.equals("Evozon")) {
            return "Learning text comparison";
        } else {
            return "Got to try some more";
        }
    }

    // 5. Create a String method that takes a String parameter and an int parameter.
    // If the text received as a parameter is equal to "Evozon", and the number received as a parameter
    // is less than or equal to 3, return the text and the number in this order. If the text is not "Evozon"
    // and the number is greater than or equal to 4, return the number and the text in this order.
    // Call the method in main() to check if it works.

    public String checkTwoTypes(String text, int number){
        if (text == "Evozon" && number <= 3) {
                return text + " " + number;
        }
        else {
            return number + " " + text;
            }
    }

    // 6. Create a String method that takes an int parameter. If the number received is greater than 8 OR
    // equal to 6, then return "The amount of snow this winter was(cm): " and the number.
    // If not, print "The forecast snow is(cm):" and the number.
    // Call the method in main() to check if it works.

    public String forecast (int number){
        if (number > 8 || number == 6) {
            return "The amount of snow this winter was(cm): " + number;
        }
        else {
            return "The forecast snow is(cm): " + number;
        }
    }

    // 7. Create a String method that takes a number parameter.
    // If the number is greater than 3 AND not equal to 4, return "The number is greater than 3 and not
    // equal to 4". If the number is equal to 4, return "The number is equal to 4";  if the number is less
    // than 3, return "The number is lower than 3". Call the method in main() to check if it works.

    public String compareNumbers(int number){
        if (number > 3 && number != 4){
            return "The number is greater than 3 and not equal to 4";
        }
        else if (number == 4) {
            return "The number is equal to 4";
        }
        else if (number == 3) {
            return " ";
        }
        else {
            return "The number is lower than 3";
        }
    }

    // 8. Create a method that takes a number as a parameter and displays the number received.
    // Using the Switch-Case construct, check what number was received and display the text "The number is: x!"
    // where x should represent the number pressed. For this example, do not use the concatenation of the string
    // "The number is:" with the number from the parameter, but write the entire text including the number for
    // each case in the Switch-Case. Call the method in main() to check if it works

    public String printNumber(int number){
        switch (number) {
            case 1: return "The number is 1!";
            case 2: return "The number is 2!";
            case 3: return "The number is 3!";
            case 4: return "The number is 4!";
            case 5: return "The number is 5!";
            case 6: return "The number is 6!";
            case 7: return "The number is 7!";
            case 8: return "The number is 8!";
            case 9: return "The number is 9!";
            case 10: return "The number is 10!";
            default: return "Invalid number";
        }
    }

    // 9. Create a method called isNumberEven. The method should take a number as a parameter and return true or false.
    // If the number is even, return true; if it is odd, return false. Call the method in main() to check if it works.

    public boolean isNumberEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    // 10. Create a method called isEligibleToVote. The method should take a number as a parameter representing the age,
    // and the method should tell you if the person has the right to vote. If the age is over 18, return true, otherwise return false.
    // Call the method in main() to check if it works.

    public boolean isEligibleToVote(int age){
        if (age >= 18) {
            return true;
        } else {
            return false;
        }
    }

// FOR LOOPS
    // 1.
    public void countToHoundred(int number){
        for (int i = number; i <= 100; i++) {
            System.out.println(i);
        }
    }
    // 2. Create a method in the LogicalOp class that takes a number as a parameter.
    // The method should check the received number and display in the console a count down to -100,
    // starting from the number received as a parameter. Pay attention to the type of method created, as the method displays, not returns.
    // Call the method in the Main class, main() method to check if it works.

    public void countToHoundredDescending(int number){
        for (int i = number; i >= -100; i--) {
            System.out.println(i);
        }
    }

    // 3. Create a method in the LogicalOp class that takes two number parameters. The method should display a count between the two received
        // numbers, starting from the first parameter received to the second (e.g., if int x is the first parameter and int y is the second,
        // the count should be from x to y). Pay attention to the type of method created, as the method displays, not returns.
        // Call the method in the Main class, main() method to check if it works.

    public void countRange(int firstNumber, int secondNumber){
        for (int i = firstNumber; i <= secondNumber; i++) {
            System.out.println(i);
        }
    }

    // 4. Create a method in the LogicalOp class that takes two number parameters. The method should check which of the two numbers is
    // larger and perform an ascending count from the smaller number to the larger number (e.g. if int x is the first parameter and
    // int y is the second, if x is greater than y, then the count should be from y to x). Pay attention to the type of method created,
    // as the method displays, not returns. Call the method in the Main class, main() method to check if it works.

    public void checkAndCount(int firstNumber, int secondNumber){
        int max;
        int min;
        if (firstNumber > secondNumber) {
            max = secondNumber;
            min = firstNumber;
        } else {
            min = firstNumber;
            max = secondNumber;
        }

        for (int i = min; i <= max; i++){
            System.out.println(i);
        }
    }


    //  5. Create a method in the LogicalOp class that displays all even numbers from 1 to 100.
    public void displayEvenNumbers(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0){
                System.out.println(i);
            }
        }
    }


    //  6. Create a method in the LogicalOp class that displays all odd numbers from 1 to 100.
    public void displayOddNumbers(){
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0){
                System.out.println(i);
            }
        }
    }

    // 7. Create a method in the LogicalOp class that takes a number parameter. The method should add all numbers up to 100,
    // starting from the number received as a parameter, and return the result at the end. Call the method in the Main class,
    // main() method to check if it works.
    public int addNumbers(int number){
        int sum = 0;
        for (int i = number; i <= 100; i++){
            sum = sum + i;
        }
        return sum;
    }

    // 8.  Create a method in the LogicalOp class that takes a number parameter. The method should add all numbers up to 100,
    // starting from the number received as a parameter, and calculate the average of the numbers. In the end, the method should return the average.
    // Call the method in the Main class, main() method to check if it works.
    public float average(int number){
        int sum = 0;
        int count = 0;
        for (int i = number; i <= 100; i++){
            sum = sum + i;
            count = count + 1;
        }
        return (float) sum / count;
    }


    // 9. Create a method in the LogicalOp class that displays the following pattern:
    public void drawPattern(){
        for (int i = 7; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println("");
            System.out.println("");
        }
        }
    }



















//}
