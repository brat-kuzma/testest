import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Calc {

    public Calc() {

    }

    public int sum(int a, int b) {
        return a + b;
    }

    protected boolean fuck(Integer i) {
        if (i > 1) {
            return true;
        } else return false;
    }

    public static void main(String[] args) {
        Predicate<Integer> perdicate = x -> x > 5;
        Consumer<Integer> cons = x -> System.out.println(x);
        Function <Integer, String> func = x -> x.toString();
        Supplier<Integer> sup = () -> new Integer(5);
    }
}
