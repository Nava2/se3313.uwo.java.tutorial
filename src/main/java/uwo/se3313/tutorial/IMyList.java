package uwo.se3313.tutorial;

/**
 * Defines a {@link java.util.List}-like interface
 *
 * @param <T> Underlying type
 */
public interface IMyList<T> {

    /**
     * Get the value at {@param index}
     * @param index Index of a value
     * @return Non-{@code null} value
     */
    T get(final int index);

    /**
     * Appends a value to the end of {@link IMyList}
     * @param value New value to append
     */
    void add(final T value);
}
