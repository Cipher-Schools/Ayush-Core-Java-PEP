import java.util.*;

public class segment{
    public static void main(String[] args) {
        String s ="catsanddog";
        List l1 = new ArrayList<>();
        l1.add("cats");
        l1.add("dog");
        l1.add("and");
        l1.add("sand");
        System.out.println(seg(s, l1));
    }
    public static boolean seg(String s , List<String> dict){
        Set<String > dictSet = new HashSet(dict);
        Set<String> used = new HashSet<>();
        boolean[] res = new boolean[s.length()+1];
        res[0] = true;
        for (int i = 1; i <= s.length(); i++) {
            for (int j = 0; j < i; j++) {
                if(res[j] && dictSet.contains(s.substring(j,i))){
                    res[i] = true;
                    used.add(s.substring(j,i));
                    break;
                }
            }
        }
        return res[s.length()] && used.equals(dictSet);
    }
}
