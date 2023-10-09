package math.teaser;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MathTeaser {
    
    public static void main(String[] args) {
        
        new MathTeaser().tease();
    }

    public void tease() {
        try (InputStreamReader ir = new InputStreamReader(new BufferedInputStream(System.in))) {

            final Random random = new Random();
            boolean showExpression = true;
            int number1 = 0;
            int number2 = 0;
            int operation = 0;
            int result = 0;

            do {
                if (showExpression) {
                    number1 = generateNumber(random, 99, 10);
                    number2 = generateNumber(random, 99, 10 );
                    operation = random.nextInt(4);
                    switch (operation) {
                        case 0:
                            result = addition(number1, number2);
                            System.out.print(number1 + " + " + number2 + " = ");
                            break;
                        case 1:
                            result = subtract(number1, number2);
                            System.out.print(number1 + " - " + number2 + " = ");
                            break;
                        case 2:
                            number1 = generateNumber(random, 15, 6 );
                            number2 = generateNumber(random, 15, 4 );
                            result = multiply(number1, number2);
                            System.out.print(number1 + " * " + number2 + " = ");
                            break;
                        case 3:
                            number1 = generateNumber(random, 180, 20 );
                            if (number1 % 3 == 0) {
                                number2 = 3;
                            } else {
                                if (number1 % 2 != 0) {
                                    number1++;
                                }
                                number2 = 2;
                            }
                            result = division(number1, number2);
                            System.out.print(number1 + " / " + number2 + " = ");
                            break;
                    }

                    showExpression = false;
                } else {
                    switch (operation) {
                        case 0:
                            System.out.print(number1 + " + " + number2 + " = " + result + "\n");
                            break;
                        case 1:
                            System.out.print(number1 + " - " + number2 + " = " + result + "\n");
                            break;
                        case 2:
                            System.out.print(number1 + " * " + number2 + " = " + result + "\n");
                            break;
                        case 3:
                            System.out.print(number1 + " / " + number2 + " = " + result + "\n");
                            break;
                    }

                    showExpression = true;
                }

            } while (ir.read() != 'q');

        } catch (IOException e) {
            System.out.println(e);

        }

    }

    private int generateNumber(Random random, int bound, int offset) {
        int number = random.nextInt(bound) + offset;
        return random.nextBoolean() ? Math.negateExact(number) : number;
    }

    private int division(int number1, int number2) {
        return number1 / number2;
    }

    private int multiply(int number1, int number2) {
        return number1 * number2;
    }

    private int addition(int number1, int number2) {
        return number1 + number2;
    }

    private int subtract(int number1, int number2) {
        return number1 - number2;
    }
}