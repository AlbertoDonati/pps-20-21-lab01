package lab01.tdd;

import java.io.Console;
import java.util.*;

public class CircularListImpl implements CircularList {

    private List<Integer> list = new LinkedList<>();
    public int myIndex;

    @Override
    public void add(int element) {
        list.add(element);
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override
    public Optional<Integer> next() {
        if(myIndex == (size()-1))
        {
            myIndex = 0;
        }
        else {
            myIndex = myIndex +1;
        }
        return Optional.of(list.get(myIndex));
    }

    @Override
    public Optional<Integer> previous() {
        if(myIndex == 0)
        {
            myIndex = size()-1;
        }
        else {
            myIndex = myIndex-1;
        }
        return Optional.of(list.get(myIndex));
    }

    @Override
    public void reset() {
        myIndex = 0;
    }

    @Override
    public Optional<Integer> next(SelectStrategy strategy) {
        return Optional.empty();
    }

}
