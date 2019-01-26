public class TShirtTester {

    public static void main(String[] args) {

        TShirt[] tShirts = new TShirt[5];

        tShirts[0] = new TShirt(TShirtSize.S,"Polex");
        tShirts[1] = new TShirt(TShirtSize.L, "Bytom");
        tShirts[2] = new TShirt(TShirtSize.L, "Polex");
        tShirts[3] = new TShirt(TShirtSize.M, "Bytom");
        tShirts[4] = new TShirt(TShirtSize.XL, "Orsay");

        for (TShirt shirt : tShirts )
        System.out.println("Posiadamy koszulkę marki " +shirt.getManufacturer() + " o rozmiarze " + shirt.getSize());
    }
}
