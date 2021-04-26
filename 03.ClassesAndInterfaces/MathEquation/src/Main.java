public class Main {

    public static void main(String[] args) {
        MathEquation[] equations = new MathEquation[4];

        equations[0] = new MathEquation('d', 100.0d, 50.0d);
        equations[1] = new MathEquation('a', 92.0d, 25.0d);
        equations[2] = new MathEquation('s', 17.0d, 225.0d);
        equations[3] = new MathEquation('m', 3.0d, 11.0d);

        for (MathEquation equation : equations) {
            equation.execute();
            System.out.println("result = " + equation.getResult());
        }
    }
}
