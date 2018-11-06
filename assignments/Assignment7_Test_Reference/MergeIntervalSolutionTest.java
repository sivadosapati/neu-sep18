import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MergeIntervalSolutionTest {

    @Test
    void merge() {
        List<Interval> l = null;
        assertEquals(0, MergeIntervalSolution.merge(l).size());
        l = new ArrayList<>();
        assertEquals(0, MergeIntervalSolution.merge(l).size());
        l.add(new Interval(1, 2));
        assertEquals(1, MergeIntervalSolution.merge(l).size());
        l.add(new Interval(2, 3));
        assertEquals(1, MergeIntervalSolution.merge(l).size());
        l.add(new Interval(2, 4));
        assertEquals(1, MergeIntervalSolution.merge(l).size());
        l.add(new Interval(5, 6));
        assertEquals(2, MergeIntervalSolution.merge(l).size());
        l.add(new Interval(4, 5));
        assertEquals(1, MergeIntervalSolution.merge(l).size());
    }
}