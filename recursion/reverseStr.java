public class reverseStr {
    public static void reverse(String str, int idx) {
        if(idx<0){
            System.out.println();
            return;
        }
        System.out.print(str.charAt(idx));
        reverse(str,idx-1);
    }
    public static void main(String[] args) {
        reverse("abcd",3);
        
    }
}
