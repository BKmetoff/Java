public  class MathEquation {
    private double leftVal;
    private double rightVal;
    private char opCode;
    private double result;

    private static int numberOfCalculations;
    private static double sumOfResults;


    public MathEquation(char opCode) {
        this.opCode = opCode;
    }

    public MathEquation(char opCode, double leftVal, double rightVal) {
        this(opCode);
        this.leftVal = leftVal;
        this.rightVal = rightVal;
    }


    public double getResult() {
        return result;
    }


    void execute() {
        switch (opCode) {
            case 'a' -> result = leftVal + rightVal;
            case 's' -> result = leftVal - rightVal;
            case 'm' -> result = leftVal * rightVal;
            case 'd' -> result = leftVal / rightVal;
            default -> {
                System.out.println("Invalid opCode: " + opCode);
                result = 0.0d;
            }
        }

        numberOfCalculations++;
        sumOfResults += result;
    }

    public static double getAverageResult() {
        return sumOfResults / numberOfCalculations;
    }
}
