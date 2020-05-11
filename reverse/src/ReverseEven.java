import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ReverseEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<List<Integer>> matrix = new ArrayList<>();
        while (sc.hasNextLine()) {
            NumberParser nb = new NumberParser(sc.nextLine());
            List<Integer> curList = nb.parsInt();
            matrix.add(curList);
        }

        for (int i = matrix.size() - 1; i >= 0; i--) {
            for (int j = matrix.get(i).size() - 1; j >= 0; j --) {
                if(matrix.get(i).get(j) % 2 == 0)
                    System.out.printf("%d ", matrix.get(i).get(j));
            }
            if(i != 0)
                System.out.println();
        }

        System.out.println(sb.toString());
    }
}
