public class CardinalPointsTester {

    public static void main(String[] args) {

        System.out.println("To jest róża wiatrów, możesz sprawdzić swoją pozycję.");
        for (CardinalPoints k : CardinalPoints.values()){
            System.out.println(k.getAbbrev());
        }

        System.out.println("\nKompas wskazuje " + CardinalPoints.NORTHEAST.getAbbrev() + ", czyli " +
        CardinalPoints.NORTHEAST.getPolName() + "/" + CardinalPoints.NORTHEAST.getEngName());


    }
}
