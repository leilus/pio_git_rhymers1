package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int DEFAULT = -1;
    public static final int CAPACITY  = -1;
    public static final int NUMBERS_COUNT = 12;
    public static final int FULL_COUNT = NUMBERS_COUNT - 1;
    public static final int EMPTY = -1;
    private final int[] NUMBERS = new int[NUMBERS_COUNT];

    private int total = EMPTY;

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

    public boolean callCheck() {
        return total == CAPACITY ;
    }

    public boolean isFull() {
        return total == FULL_COUNT;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT ;
        return NUMBERS[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT ;
        return NUMBERS[total--];
    }

}
