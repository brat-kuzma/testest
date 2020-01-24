import java.util.function.IntConsumer;
import java.util.function.IntFunction;
import java.util.function.IntUnaryOperator;

public class TestFunctionInterface  {
    public static void main(String[] args) {
        IntUnaryOperator func = x -> {
            return x*x;
        };

        IntConsumer print = x -> System.out.print(x);
    }

}
