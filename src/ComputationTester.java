public class ComputationTester {

    public static void main(String[] args) {
        System.out.println("Dzielenie: \t\t" + Computation.DIVIDE.perform(10,5));
        System.out.println("Mnożenie: \t\t" + Computation.MULTIPLY.perform(10,5));
        System.out.println("Dodawanie: \t\t" + Computation.ADD.perform(10,5));
        System.out.println("Odejmowanie: \t" + Computation.SUBTRACT.perform(10,5));

    }
}
