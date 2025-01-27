package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Using a lambda expression to implement StringOperation
        StringOperation toUpperCase = (String input) -> input.toUpperCase();

        // Test the lambda with a string
        String result = toUpperCase.apply("hello world");

        // Print the result
        System.out.println(result); 
    }
}


