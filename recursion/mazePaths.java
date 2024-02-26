public class mazePaths {
    public static int countPaths(int i, int j) {
        if(i==2 && j==2){
            return 1;
        }
        if (i > 2 || j > 2) {
            return 0;
        }
        int count = 0;
        
        count += countPaths(i+1, j);
        count += countPaths(i, j+1);
        return count;
        
    }
    public static void main(String[] args) {
        int x;
        x=countPaths(0, 0);
        System.out.println(x);
        path("", 3, 3);
    }
    static void path(String p, int r, int c) {
        if (r == 1 && c == 1) {
            System.out.println(p);
            return;
        }

        if (r > 1) {
            path(p + 'D', r-1, c);
        }

        if (c > 1) {
            path(p + 'R', r, c-1);
        }
    }
}
