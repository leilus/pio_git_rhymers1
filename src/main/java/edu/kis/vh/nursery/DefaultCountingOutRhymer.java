package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int ERROR = -1;
    public static final int FULL_COUNT = 11;
    public static final int NUMBERS_COUNT = 12;
    private final int[] NUMBERS = new int[NUMBERS_COUNT];
    public int total = -1;

    public void countIn(int in) {
        if (!isFull())
            NUMBERS[++total] = in;
    }

        public boolean callCheck() {
            return total == ERROR;
        }
        
            public boolean isFull() {
                return total == FULL_COUNT;
            }
        
                protected int peekaboo() {
                    if (callCheck())
                        return ERROR;
                    return NUMBERS[total];
                }
            
                    public int countOut() {
                        if (callCheck())
                            return ERROR;
                        return NUMBERS[total--];
                    }

}
