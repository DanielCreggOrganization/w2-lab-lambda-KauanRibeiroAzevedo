package ie.atu.lambda;

public class Main {
    public static void main(String[] args) {
        // Create an instance of ToUpperCase
        StringOperation toUpperCase = new ToUpperCase();

        // Test it with a string
        String result = toUpperCase.apply("hello world");

        
        System.out.println(result); 
    }
}

