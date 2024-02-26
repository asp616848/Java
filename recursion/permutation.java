public class permutation {
    
    public static void permutationfn(String str,String newString) {
        if(str.length()==0){
            System.out.println(newString);
            return;

        }
        for(int i=0;i<str.length();i++){
            char currchar = str.charAt(i);
            String newStr = str.substring(0,i) + str.substring(i+1);
            permutationfn(newStr, newString+currchar);
        }
    }
    public static void main(String[] args) {
        permutationfn("abc", "");
    }
    
}
