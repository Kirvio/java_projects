import java.util.Arrays;
import java.util.List;

public class ForEach{
    public static void main(String[] args) {
        List<Integer> lst = Arrays.asList(4,6,3,7,8,2);
        // in Stream you can perform any operation with an array
        // and its not going to affect original array
        // once you use the Stream you cann't reuse it
        // Stream<Integer> st1 = lst.stream();
        // Stream<Integer> st2 = st1.filter(n -> n%2==0);
        // Stream<Integer> st3 = st2.map(n -> n*2);
        // int result = st3.reduce(0, (c,e) -> c+e);
        int result = lst.stream()
                        .filter(n -> n%2==0)
                        .map(n -> n*2)
                        .reduce(0, (c,e) -> c+e);
        System.out.println(result);
        // gives you one value at a time
        // st3.forEach(n -> System.out.println(n));
        // st1.forEach(n -> System.out.println(n));     
    }
}