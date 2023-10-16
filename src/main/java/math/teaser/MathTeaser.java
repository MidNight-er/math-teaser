package math.teaser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class MathTeaser {
    
    public static void main(String[] args) {
        
        new MathTeaser().tease();
    }

    public void tease() {
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {

            final Random random = new Random();
            boolean showExpression = true;
            int number1 = 0;
            int number2 = 0;
            int operation = 0;
            int result = 0;
            boolean isConvertTo = true;
            do {
                if (showExpression) {
                    number1 = generateNumber(random, 139, 10);
                    number2 = generateNumber(random, 139, 10 );
                    operation = random.nextInt(5);
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
                            number1 = generateNumber(random, 18, 6 );
                            number2 = generateNumber(random, 18, 4 );
                            result = multiply(number1, number2);
                            System.out.print(number1 + " * " + number2 + " = ");
                            break;
                        case 3:
                            number1 = generateNumber(random, 90, 10 );
                            for (int i = 0; i < 15; i++) {
                                number2 = generateNumber(random, 8, 2);
                                if (number1 % number2 == 0) {
                                   break;
                                }
                            }

                            if (modulus(number1, number2) != 0) {
                                result = modulus(number1, number2);
                                System.out.print(number1 + " % " + number2 + " = ");
                            } else {
                                result = division(number1, number2);
                                System.out.print(number1 + " / " + number2 + " = ");
                            }

                            break;
                        case 4:
                            number1 = convert(random, 7, 9);
                            isConvertTo = random.nextBoolean();
                            if (isConvertTo) {
                                System.out.print(number1 + " 0x" + " = ");
                            } else {
                                System.out.print("0x" + Integer.toHexString(number1).toUpperCase() + " = ");
                            }
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
                            if (modulus(number1, number2) != 0) {
                                System.out.print(number1 + " % " + number2 + " = " + result + "\n");
                            } else {
                                System.out.print(number1 + " / " + number2 + " = " + result + "\n");
                            }
                            break;
                        case 4:
                            if (isConvertTo) {
                                System.out.print(number1 + " 0x" + " = 0x" + Integer.toHexString(number1).toUpperCase() + "\n");
                            } else {
                                System.out.print("0x" + Integer.toHexString(number1).toUpperCase() + " = " + number1 + "\n");
                            }
                            break;
                    }

                    showExpression = true;
                }

            } while (br.read() != 'q');

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

    private int convert(Random random, int bound, int offset) {
        return random.nextInt(bound) + offset;
    }

    private int modulus(int number1, int number2) {
        return number1 % number2;
    }
}
