import java.util.HashSet;

public class uniqueSubSequence {
    public static void subsequence(String str, int idx, String USubSequence, HashSet<String> set) {
        if(idx==str.length()){
            if (set.contains(USubSequence)){
                return;
            }
            else{
                set.add(USubSequence);
                System.out.println(USubSequence);
                return;
                
            }
        }
        char currchar = str.charAt(idx);
        subsequence(str, idx+1, USubSequence+currchar, set);
        subsequence(str, idx+1, USubSequence, set);
    }
    public static void main(String args[]) {
        HashSet<String> set = new HashSet<>();
        subsequence("aaa", 0, "", set);
    }
}
