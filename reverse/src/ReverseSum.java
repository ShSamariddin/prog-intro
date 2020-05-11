import javax.swing.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ReverseSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        List<List<Integer>> matrix = new ArrayList<>();
        int maxLineSize = 0;
        while (sc.hasNextLine()) {
            NumberParser nb = new NumberParser(sc.nextLine());
            List<Integer> curList = nb.parsInt();
            maxLineSize = Math.max(maxLineSize, curList.size());
            matrix.add(curList);
        }
        Integer[] row = new Integer[matrix.size()];
        Integer[] col = new Integer[maxLineSize];
        Arrays.fill(row, 0);
        Arrays.fill(col, 0);

        for (int i = 0; i < matrix.size(); i++){
            for (int x: matrix.get(i)){
                row[i] += x;
            }
        }

        for (List<Integer> x : matrix){
            for (int i = 0; i < x.size(); i++){
                col[i] += x.get(i);
            }
        }

            for (int i = 0; i < matrix.size(); i++) {
                for (int j = 0; j < matrix.get(i).size(); j++) {
                    System.out.printf("%d ", row[i] + col[j] - matrix.get(i).get(j));
                }
                if (i != matrix.size() - 1)
                    System.out.println();
            }

        System.out.println(sb.toString());
    }
}
