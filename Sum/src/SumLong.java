import java.util.List;


public class SumLong {
    public static void main(String[] args) {
        long total = 0;
        for (String s : args) {
            NumberParser parser = new NumberParser(s);
            List<Long> listNumber = parser.parsLong();
            for (Long num : listNumber) {
                total += num;
            }
        }
        System.out.println(total);
    }


}
