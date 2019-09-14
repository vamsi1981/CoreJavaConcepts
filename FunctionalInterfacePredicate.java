import java.util.List;
import java.util.function.Predicate;

class EqualsZero<E> implements Predicate<Integer> {

    @Override
    public boolean test(int paramVal) {

        int val = 0;

        return paramVal == val;
    }
}

public class FunctionalInterfacePredicate {

    public static void main(String[] args) {

        List<Integer> nums = List.of(2, 3, 1, 0, 6, 7, 8, 9, 12);

        EqualsZero<Integer> btf = new EqualsZero<>();
        nums.stream().filter(btf).forEach(System.out::println);
    }
}
