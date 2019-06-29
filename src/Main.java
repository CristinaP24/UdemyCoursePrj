public class Main {
    public static void main(String args[]) {
//float is single-precision, it allows , if you don't add f, you can cast (float) = not reccomended
// float si double apar cu .0 - floating point nos
// int - it doesn't take the remainder
// double has more precision than float - mai multe zecimale, is defalut if you don't specify f or d, it is faster and many functions in Java have in-built double
//with strings you can use char from unicode and +
        //strings are concatenated, if you add int/float/double to string variable, it is only treated as text, concat, not math
        Expressions expressions = new Expressions();


        expressions.expression();
        expressions.calcFeetInchesToCm(2, 7);
        expressions.calcFeetInchesToCm(45);
        expressions.switchExampleInts();
        expressions.switchExampleChars();
        expressions.switchExampleString();
        // expressions.calculateInterest(10000, 2);
        expressions.simpleForExample();
        //expressions.doubleForExample2();
        // expressions.doubleForExample3();
        expressions.evenNumberWhile2();
        expressions.evenNumberWhile3();


        ArraysLists arraysLists = new ArraysLists();

        arraysLists.arrayGetEx();
    }
}






