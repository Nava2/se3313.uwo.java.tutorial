package uwo.se3313.tutorial;

import java.util.ArrayList;
import java.util.List;

/**
 * Implements a {@link IMyList} of {@link Long}
 */
public class MyLongList implements IMyList<Long> {

    private final List<Long> list;

    public MyLongList() {
        list = new ArrayList<>();
    }

    @Override
    public Long get(int index) {
        return list.get(index);
    }

    @Override
    public void add(Long value) {
        list.add(value);
    }
}
