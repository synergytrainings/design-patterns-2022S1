import java.util.concurrent.atomic.AtomicInteger;

public class NumberGenerator {

    private static final AtomicInteger maxNumber = new AtomicInteger(0);

    private static final NumberGenerator INSTANCE = new NumberGenerator();

    private NumberGenerator() {

    }

    public static NumberGenerator getInstance() {
        return INSTANCE;
    }

    public synchronized int getNextNumber() {
        return maxNumber.incrementAndGet();
    }

}
