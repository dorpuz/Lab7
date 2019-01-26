public class EnumTest {

    public static void main(String[] args) {
        System.out.println(Types.ONE);
        System.out.println(Types.valueOf("TWO"));
        System.out.println(Types.THREE.name());

        System.out.println("------------");
        for(Types types : Types.values()){
            System.out.println(types.ordinal() + " " + types);
        }
    }
}

enum Types {
    ONE, TWO, THREE
}
