public class Main {

    public static void main(String[] args) {
        double value1 = 100;
        double value2 = 0;
        double result = 0d;
        char opCode = 'd';

        switch (opCode) {
            case 'a' -> result = value1 + value2;
            case 's' -> result = value1 - value2;
            case 'm' -> result = value1 * value2;
            case 'd' -> result = value2 != 0 ? value1 / value2 : 0.0;
            default -> {
                System.out.println("invalid opt code: " + opCode);
                result = 0.0d;
            }
        }

        System.out.println(result);
    }
}
