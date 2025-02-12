public class Fundamentals{
    public static void main(String[] args){
        //This is the first fundamental
        System.out.println("Hello World");
        //This is the second fundamental
        int num=10;
        String message="The number is";
        System.out.println(message+ " "+num);
        //This is the third fundamental
        int number=15;
        if (number % 2 == 0){
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }

        //This is the fourth fundamental
        for (int i=0; i<5; i++){
            System.out.println("The value of i is: "+i);
        }
        //This is the fifth fundamental
        greet("Alice");
        printNumbers();

        //This is the eighth fundamental
        try {
            int numerator = 10;
            int denominator = 0;
            int result = numerator / denominator; // This will cause an exception
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        }

        System.out.println("Program continues after exception handling.");
    }

    //skipped 6th fundamental

    public static void greet(String name) {
        System.out.println("Hello, " + name);
    }

    //this is the seventh fundamental
    public static void printNumbers() {
        int[] numbers = {1, 2, 3, 4, 5};
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}