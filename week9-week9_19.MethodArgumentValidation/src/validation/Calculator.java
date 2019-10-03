package validation;

public class Calculator {

    public int multiplication(int fromInteger) {
        if(fromInteger < 0){
            throw new IllegalArgumentException();
        }
        
        int multiplication = 1;
        for (int i = 1; i <= fromInteger; i++) {
            multiplication *= i;
        }

        return multiplication;
    }

    public int binomialCoefficient(int setSize, int subsetSize) {
        if(setSize < 0){
            throw new IllegalArgumentException("setSize must be > 0");
        }
        
        if(subsetSize < 0){
            throw new IllegalArgumentException("subsetSize must be > 0");
        }
        
        if(subsetSize < setSize){
            throw new IllegalArgumentException("subsetSize must be > setSize");
        }
        
        int numerator = multiplication(setSize);
        int denominator = multiplication(subsetSize) * multiplication(setSize - subsetSize);

        return numerator / denominator;
    }
}
