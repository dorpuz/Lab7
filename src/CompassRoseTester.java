public class CompassRoseTester {
    public static void main(String[] args) {
        CompassRose[] compassRose = {
                new CompassRose(CardinalPoints.EAST),
                new CompassRose(CardinalPoints.WEST)
        };

        for (CompassRose direction : compassRose){
            System.out.println(direction.getCardinalPoints().getAbbrev() + "to " + direction.getCardinalPoints().getPolName());
        }
    }
}
