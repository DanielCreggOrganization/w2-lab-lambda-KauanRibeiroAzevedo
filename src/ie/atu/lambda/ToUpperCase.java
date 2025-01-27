package ie.atu.lambda;

public class ToUpperCase implements StringOperation {
    @Override
    public String apply(String str) {
        return str.toUpperCase();
    }
}


