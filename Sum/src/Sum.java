import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isWhitespace;

public class Sum {
    public static void main(String[] args) {
        int total = 0;
        for (String s : args) {
            NumberParser parser = new NumberParser(s);
            List<Integer> listNumber = parser.parsInt();
            for (int num : listNumber) {
                total += num;
            }

        }
        System.out.println(total);
    }


}