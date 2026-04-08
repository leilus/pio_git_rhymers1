package edu.kis.vh.nursery;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class DefaultCountingOutRhymerTest {

    @Test
    void shouldReturnNumbersInReverseOrder() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        rhymer.countIn(1);
        rhymer.countIn(2);
        rhymer.countIn(3);

        assertEquals(3, rhymer.countOut());
        assertEquals(2, rhymer.countOut());
        assertEquals(1, rhymer.countOut());
    }

    @Test
    void shouldBeEmptyAfterRemovingAll() {
        DefaultCountingOutRhymer rhymer = new DefaultCountingOutRhymer();

        rhymer.countIn(1);
        rhymer.countOut();

        assertTrue(rhymer.callCheck());
    }
}
