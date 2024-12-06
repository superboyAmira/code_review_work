public class Calculator {
	
    public int solver(int a, int b, int c) {
        int numberTimes = times(a, b);
        int numberDiv = div(c, a);
        int numberAdd = add(numberTimes, numberDiv);
        return dif(numberAdd, a);
    }
    public int add(int a, int b) {
        return a + b;
    }

    public int dif(int a, int b) {
        return a - b;
    }

    public int div(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divide by zero error");
        }

        return a / b;
    }

    public int times(int a, int b) {
        return a * b;
    }

}
