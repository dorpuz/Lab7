import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Lab5_2 {

    public static void main(String[] args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get("src/crsto10.txt"));

/*
        System.out.println(lines.size());
        System.out.println(lines.get(0));
*/

        Lab5_2 lab5_2 = new Lab5_2();
        System.out.println(lab5_2.countLines(lines));
        lab5_2.showEvery100Line(lines);
        System.out.println("----------------");
        lab5_2.showLongestUppercase(lines);
    }

    public int countLines(List list) {
        return list.size();
    }

    public void showEvery100Line(List list) {

        for (int i = 0; i <list.size() ; i=i+100) {
            System.out.println(list.get(i));
        }
    }
    public void showLongestUppercase (List list){
        int temp = 0;
        int pointer = 0;
        String s = "";

        for (int i = 0; i <list.size(); i++) {
            if (temp <(((String)list.get(i)).length())){
                temp = ((String)list.get(i)).length();
                pointer =i ;
            }
        }

        String longest = (String) list.get(pointer);
        String longUpper = longest.toUpperCase();

        System.out.println(longUpper + " o długości " + temp);
        System.out.println("Index wersu: " + pointer);
    }

}
