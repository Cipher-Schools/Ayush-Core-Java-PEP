import java.util.HashMap;

public class Window {
    public static void main(String[] args) {
        String s1 = "ABKCLOOOPBDCKKGH";
        String s2 = "ABC";
        String res = WindowSubs(s1, s2);
        System.out.println(res);
    }
    public static String WindowSubs(String s1, String s2){
        HashMap<Character,Integer> map = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            Character s2Char = s2.charAt(i);
            int count = map.getOrDefault(s2Char, 0);
            map.put(s2Char, count+1);
        }
        int s2CharacterCount = map.size();
        int lIdx = 0 , rIdx = 0;
        int lAns = -1, rAns = -1;

        while(rIdx <= s1.length()){
            if(s2CharacterCount > 0){
                if(rIdx == s1.length())
                    break;
                rIdx ++;
                Character s1Char = s1.charAt(rIdx -1);
                if(map.containsKey(s1Char)){
                    int count = map.get(s1Char);
                    if(count ==1 )
                        s2CharacterCount -- ;
                    map.put(s1Char, count -1);
                }
            }
            else{
                int currWindow = rIdx - lIdx;
                int answer = rAns - lAns;
                if(lAns == -1 || currWindow<answer ){
                    lAns = lIdx;
                    rAns = rIdx;
                }
                lIdx++;
                Character s1Char = s1.charAt(lIdx -1);
                if(map.containsKey(s1Char)){
                    int count = map.get(s1Char);
                    if(count == 0 )
                        s2CharacterCount ++ ;
                    map.put(s1Char, count +1);
                }
            }
        }
        if(lAns == -1)
         return "";
        else
         return s1.substring(lAns, rAns);
    }
}
