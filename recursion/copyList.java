import java.util.ArrayList;
import java.util.List;

public class copyList {
    public static void main(String[] args) {
       int[] arr= {5,654,3};
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        outer.add(new ArrayList<>());
        outer.get(1).add(arr[0]);
        outer.get(1).add(arr[1]);
        outer.get(1).add(arr[2]);
        List<Integer> internal = new ArrayList<>(outer.get(1));
        System.out.println(internal);
        System.out.println(outer);
    }
}
