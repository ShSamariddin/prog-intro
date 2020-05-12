import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;

public class WordStatWords {
    private static HashMap<String, Integer> ma = new HashMap<>();
    private static List<String> chronologicalOrder = new ArrayList<>();
    public static void main(String[] args)  {
        Scanner sc;
        try {
            sc = new Scanner(new File(args[0]), StandardCharsets.UTF_8);
        } catch (ArrayIndexOutOfBoundsException | IOException  e){
            System.out.println("Input file not found");
            sc = new Scanner(System.in);
        }
        while(sc.hasNextLine()){
            String str = sc.nextLine();
            System.out.println(str);
            counter(str);
        }
        PrintWriter out;
        try {
            out = new PrintWriter(new File(args[1]));
        } catch (Exception e){
            System.out.println("Output file not found");
            out = new PrintWriter(System.out);
        }
        chronologicalOrder.sort(Comparator.naturalOrder());
        for(String k: chronologicalOrder){
            out.printf("%s %d\n", k, ma.get(k));
        }
        out.close();
        sc.close();
        ma.clear();
        chronologicalOrder.clear();
    }

    public static boolean isLegalCharacter(char c){
        return Character.isLetter(c) || c == '\''  || Character.getType(c) == Character.DASH_PUNCTUATION;
    }

    private static void putCurWord(String newWord){
        if(ma.containsKey(newWord)) {
            ma.put(newWord, ma.get(newWord) + 1);
        } else {
            chronologicalOrder.add(newWord);
            ma.put(newWord, 1);
        }
    }
    private static void counter(String str) {
        StringBuilder curWord = new StringBuilder();
        for (char c: str.toCharArray()){
            if(!isLegalCharacter(c)){
                if (curWord.length() > 0){
                    putCurWord(curWord.toString().toLowerCase());
                    curWord = new StringBuilder();
                }
            } else{
                curWord.append(c);
            }
        }
        if(curWord.length() > 0){
            putCurWord(curWord.toString().toLowerCase());
        }
    }
}
