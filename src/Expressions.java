public class Expressions {

    //expressions have: var, values, operators
    //an expression = what is in brackets, braces and brackets are not part of the expression
    //statement is an entire line, with brackets and braces too
    //statements don't have to be on same line
    //statements examples
    // have multiple statements on same line
    //outside codeblock {}, you can't acces variables inside the codeblock


    public void expression() {
        //course029
        boolean gameOver = true;
        int score = 10000;
        int lvlCompleted = 5;
        int bonus = 100;

        int highScore = calculateScore(true, 800, 5, 100);//aici dau argumente pt parametrii definiti
        System.out.println("Your final score was " + highScore);
        score = 10000;
        lvlCompleted = 8;
        bonus = 200;
        highScore = calculateScore(true, 800, 5, 100);//aici dau argumente pt parametrii definiti
        System.out.println("Your final score was " + highScore);


//        if (gameOver) {  //same as (gameOver==)
//            int finalScore = score + (lvlCompleted + bonus);
//            System.out.println("Your final score was: " + finalScore);
//        }
    }

    //    if (gameOver) {
//        int finalScore = ((score * 2) + ((lvlCompleted + 3) + ((bonus * 2))));
//        System.out.println("Your final score 2 was: " + finalScore);
//    }
    public int calculateScore(boolean gameOver, int score, int lvlCompleted, int bonus) {//aici definesc parametrii metodei
        //nu e nevoie sa pun si aici parametrii
        if (gameOver) {
            int finalScore = score + (lvlCompleted + bonus);
            finalScore += 2000;

            return finalScore;
        } else {
            return -1;//mereu trebuie sa returnez cand nu am void si cand if=f, pun else return=-1 sau pun doar return -1;
        }
    }

    //ex calculate and display
//    highScorePosition = calculateHighScorePosition(1500);
//    displayHighScorePosition =
//
//    calculateHighScorePosition()
    //!cont aci

    public void displayHighScorePosition(String playerName, int positionHighScoreTable) {
        System.out.println(playerName + "managet to get into position"
                + positionHighScoreTable + "on the highscore tablle");
    }

    public int calculateHighScorePosition(int playerScore) {
        if (playerScore >= 1000) {
            return 1;
        } else if (playerScore >= 500 && playerScore < 1000) {
            return 2;
        } else if (playerScore >= 100 && playerScore < 500) {
            return 3;
        } else {
            return 4;
        }
    }

    //Met overloading 031
    //same met with different parameters
    //overloaded met. has the same name, but must have same data type (string, int)
    //overloade met. must have uniques signature = parameters in ()
    public void metOverloadCourse() {
        int newScore = calculateScore("Cris", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();
        double centimeters = calcFeetInchesToCm(3, 7);
        if (centimeters < 0.0) {
            System.out.println("Invalid parameters");
        }
    }

    public int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + "scored " + score + "points.");
        return score * 1000;
    }

    public int calculateScore(int score) {
        System.out.println("Unnamed Player scored " + score + "points.");
        return score * 1000;
    }

    public int calculateScore() {
        System.out.println("No player name, no score.");
        return 0;
    }

    //Exercise Met Overload 031
    //make a met 2 params: feet, inches
    public double calcFeetInchesToCm(double feet, double inches) {
        if (feet < 0 || ((inches < 0) || (inches > 12))) {
            System.out.println("Invalid feet or inches parameters");
            return -1;
        }
        double centimeters = (feet * 12) * 2.54;
        centimeters += inches * 2.54;
        System.out.println(feet + " feet" + inches + " inches = " + centimeters + " cm");
        return centimeters;
    }
    //if parameters are valid, calculate hom many cm comprise the feet and inches passed to this met, and return value
    //1 foot = 30.38 cm
    //1 inch = 2.54 cm

    public double calcFeetInchesToCm(double inches) {
        if (inches < 0) {
            return -1;
        }
        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches is equal to " + feet + " feet and " + remainingInches + " inches");
        return calcFeetInchesToCm(feet, remainingInches);//returnung and calling met at same time
    }

    //Switch statement Course 033
    //default KW is like else
    //switch is less flexible than if, we can only test the switch value and cases for it
    //switch good to use if testing the same var and test different values
    //if you forget break, will fall through branch until end
    //even if at end, good practice to use break
    //used with: byte, short, char, int
    //in string, Upper/Lowercase is different string value - use inbuild met .toLowerCase()
    public void switchExampleInts() {
        int switchValue = 3;
        switch (switchValue) {
            case 1: //means if swichValue ==1
                System.out.println("This is switch 1.");
                break;
            case 2:
                System.out.println("This is switch 2.");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Was 3 or 4, or 5.");
                break;
            default:
                System.out.println("Wasn't 1 or 2.");
        }
    }

    public void switchExampleChars() {
        char switchValue = 'B';
        switch (switchValue) {
            case 'A': //means if swichValue ==1
                System.out.println("This is switch A.");
                break;
            case 'B':
                System.out.println("This is switch B " + switchValue);
                break;

            case 'C':
            case 'D':
            case 'E':
                System.out.println("This is switch C,D,E " + switchValue);
                break;

            default:
                System.out.println("Not A, B, C, D, or E " + switchValue);
                break;

        }
    }

    public void switchExampleString() {
        String month = "January";
        switch (month.toLowerCase()) {
            case "january":
                System.out.println("This is Jan. " + month);
                break;
            case "february":
                System.out.println("This Feb " + month);
                break;
            case "march":
                System.out.println("This March " + month);
                break;
            default:
                System.out.println("Not sure.");
        }

    }
    //For Statement Course 034
    //use method String.format and add %numberf - to format a double/float number to the number of decimals you want.

    public double calculateInterest(double amount, double interestRate) {
        //System.out.println("10 000 at 200 interest rate = " + calculateInterest(10000, 2));
        return (amount * (interestRate / 100));
    }

    public void simpleForExample() {
        for (int i = 0; i < 5; i++)
            System.out.println("Loop " + i + " Hello.");

    }

    public void doubleForExample2() {
        for (int i = 2; i < 9; i++)
            System.out.println(String.format("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i))));
    }

    //ex. same as doubleForExample2 but start for 8% and go back to 2%
    public void doubleForExample3() {
        for (int i = 8; i >= 2; i--)
            System.out.println(String.format("10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000, i))));
    }

    //While do while Course 0.35
    //always increment
    //used when you don't know how many times you need to iterate
    public void simpleWhileIfExample() {
        int count = 1;
        while (true) {
            if (count != 6) {
                break;
            }
            System.out.println("Count value in while and if is " + count);
            count++;
        }
    }

    public void simpleWhileExample() {
        int count = 1;
        while (count != 6) {
            System.out.println("Count value in while " + count);
            count++;

        }
    }

    // do while statement always exectutes at least once
    //ex. count==6  - in do executes once, then it goes to loop
    public void simpleDoWhileExample() {
        int count = 6;
        do {
            System.out.println("Count value in do-while is " + count);
            count++;
            if (count > 100) {
                break;
            }
        } while (count != 6);
    }

    //ex. a met. that det. if an int is an even no. If Y - return true, If N - return false
    public boolean evenNumberWhile1If(int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    //this code starts at no 5, increment including 20, test to see if it is an even no, if not,
// we increment on next no and continue = back to while and stop processing this time with new no (number++)
    public void evenNumberWhile2() {
        int number = 5;
        int finishNumber = 20;
        while (number <= finishNumber)
            if (!evenNumberWhile1If(number)) {
                number++;
                continue;
            }
        System.out.println("Even no " + number);
        number++;
    }

    //Ex. modify code to record total no of even nos found. break once 5 have been found, display sum of even nos.
    public void evenNumberWhile3() {
        int number = 5;
        int evenNosFound = 0;
        int finishNumber = 20;
        while (number <= finishNumber){
            if (!evenNumberWhile1If(number)) {
                number++;
                continue;
            }

        System.out.println("Even no " + number);
        number++;
            evenNosFound++;
            if(evenNosFound>=5) {
                break;
            }
    }
        System.out.println("Total even nos is "+evenNosFound);

}
}


















