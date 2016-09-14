package uwo.se3313.tutorial;

/**
 * Class designed to store foo and bar values.
 */
public class MyClass implements IMyClass {

    /**
     * Static variable available to other classes
     */
    public static final long VARIABLE = 2;

    /**
     * The foo
     */
    private final int foo;

    /**
     * The bar
     */
    private double bar;

    /**
     * Creates a new instance
     * @param foo value for the foo
     * @param bar value for the bar
     */
    public MyClass(int foo, double bar) {
        this.foo = foo;
        this.bar = bar;
    }

    @Override
    public int getFoo() {
        return foo;
    }

    @Override
    public double getBar() {
        return bar;
    }

    @Override
    public void setBar(double bar) {
        this.bar = bar;
    }

}
