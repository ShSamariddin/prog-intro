import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isWhitespace;

public class NumberParser {
    private String par;

    public NumberParser(String par) {
        this.par = par;
    }

    public List<Integer> parsInt() {
        List<String> splitIn = mySplit(par);
        List<Integer> ans = new ArrayList<>();
        for (String s : splitIn) {
            ans.add(Integer.parseInt(s));
        }
        return ans;
    }

    public List<Long> parsLong() {
        List<String> splitIn = mySplit(par);
        List<Long> ans = new ArrayList<>();
        for (String s : splitIn) {
            ans.add(Long.parseLong(s));
        }
        return ans;
    }

    public List<Long> parsLongHex() {
        List<String> splitIn = mySplit(par);
        List<Long> ans = new ArrayList<>();
        for (String s : splitIn) {
            if (isHex(s)) {
                System.out.println(s);
                ans.add(Long.parseLong(s.substring(2, s.length()), 16));
            } else {
                ans.add(Long.parseLong(s));
            }
        }
        return ans;
    }

    public boolean isHex(String s) {
        if (s.length() >= 3 && (s.charAt(1) == 'x' || s.charAt(1) == 'X')) {
            return true;
        }
        return false;

    }

    private static List<String> mySplit(String in) {

        StringBuilder curString = new StringBuilder();
        List<String> ans = new ArrayList<>();
        for (int i = 0; i < in.length(); i++) {
            if (isWhitespace(in.charAt(i)) && curString.length() > 0) {
                ans.add(curString.toString());
                curString = new StringBuilder();
            } else if (!isWhitespace(in.charAt(i))) {
                curString.append(in.charAt(i));
            }
        }
        if (curString.length() > 0) {
            ans.add(curString.toString());
        }
        return ans;
    }
}