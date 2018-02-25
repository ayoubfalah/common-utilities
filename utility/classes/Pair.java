package utility.classes;

/**
 *
 * @author ayoubfalah
 * @param <T>
 */
public class Pair<T> {

    private final T a;
    private final T b;

    public Pair(T a, T b) {
        this.a = a;
        this.b = b;
    }

    public T getA() {
        return a;
    }

    public T getB() {
        return b;
    }

    @Override
    public String toString() {
        return "(" + a + "," + b + ")";
    }
}