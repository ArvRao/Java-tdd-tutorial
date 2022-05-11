public class Numbers {
    //* Business logic
    public int add(int num1, int num2) {
        return num1 + num2;
    }

    public int substract(int num1, int num2) {
        return num1 - num2;
    }

    public double multiply(double num1, double num2) {
        if ((num1 ==0 || num2 == 0)) {
            return 0;
        }
        return num1 * num2;
    }

    public float divide(float num1, float num2) {
        if(num2 == 0) {
            throw new IllegalArgumentException("Divide by zero not possible");
        }
        return num1 / num2;
    }

}
