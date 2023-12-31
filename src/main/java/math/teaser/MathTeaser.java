package math.teaser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;
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
            LocalTime localTime = LocalTime.now();
            boolean isConvertTo = true;
            do {
                if (showExpression) {
                    number1 = generateNumber(random, 139, 10);
                    number2 = generateNumber(random, 139, 10 );
                    operation = random.nextInt(2);
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
                            number1 = generateNumber(random, 16, 2);
                            number2 = generateNumber(random, 14, 7);
                            result = multiply(number1, number2);
                            System.out.print(number1 + " * " + number2 + " = ");
                            break;
                        case 3:
                            number1 = generateNumber(random, 80, 11 );
                            number2 = generateNumber(random, 12, 2);
                            if (Math.abs(number1) < Math.abs(number2)) {
                                int tmp = number1;
                                number1 = number2;
                                number2 = tmp;
                            }
                            final int modulus = modulus(number1, number2);
                            if (modulus != 0) {
                                result = division(number1 - modulus, number2);
                            } else {
                                result = division(number1, number2);
                            }
                            System.out.print(number1 + " / " + number2 + " = ");
                            break;
                        case 4:
                            number1 = Math.abs(generateNumber(random, 600,  2));
                            number2 = Math.abs(generateNumber(random, 600,  2));
                            localTime = LocalTime.ofSecondOfDay(number1).plusSeconds(number2);
                            System.out.print(LocalTime.ofSecondOfDay(number1) + " + " + LocalTime.ofSecondOfDay(number2) + " = ");
                            break;
                        case 5:
                            number1 = convert(random, 100, 10);
                            isConvertTo = random.nextBoolean();
                            if (isConvertTo) {
                                System.out.print(number1 + " to 0x" + " = ");
                            } else {
                                System.out.print("0x" + Integer.toHexString(number1).toUpperCase() + " = ");
                            }
                            break;
                        case 6:
                            // devide number to consist of multiple numbers, ad comparison. (for example one number
                            // has to be less than, other more than)
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
                            final int modulus = modulus(number1, number2);
                            if (modulus != 0) {
                                System.out.print(number1 + " / " + number2 + " = " + result + "; remainder = " + modulus + "\n");
                            } else {
                                System.out.print(number1 + " / " + number2 + " = " + result + "\n");
                            }
                            break;
                        case 4:
                            System.out.print(LocalTime.ofSecondOfDay(number1) + " + " + LocalTime.ofSecondOfDay(number2) + " = " + localTime + "\n");
                            break;
                        case 5:
                            if (isConvertTo) {
                                System.out.print(number1 + " to 0x" + " = 0x" + Integer.toHexString(number1).toUpperCase() + "\n");
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
