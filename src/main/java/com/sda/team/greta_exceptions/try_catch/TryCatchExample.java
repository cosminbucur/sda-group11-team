package com.sda.team.greta_exceptions.try_catch;

public class TryCatchExample {

    public static void main(String[] args) {

        divide(15, 3);
        divide(39, 0);
        divide(25, 5);
    }

    public static int divide(int firstNumber, int secondNumber) {
        int result = 0;
        try {
            result = firstNumber / secondNumber;
            System.out.println("The result is: " + result);
            return result;
        } catch (ArithmeticException e) {
            System.out.println("Check the numbers you entered");
            System.out.println("The message is " + e.getMessage());
            System.out.println("The cause is " + e.getCause());
        } catch (Exception e) {
            System.out.println("Something's wrong");
            System.out.println("The message is " + e.getMessage());
            System.out.println("The cause is " + e.getCause());
        } finally {
            System.out.println("This happens anyway");
        }
        return result;
    }
}

