import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FindMedianSolutionTest {

    @Test
    void findMedianSortedArrays() {
        int[] nums1 = new int[] {1, 2, 3};
        int[] nums2 = new int[0];
        assertEquals(2, FindMedianSolution.findMedianSortedArrays(nums1, nums2));
        nums2 = new int[] {2, 4, 6, 8};
        assertEquals(3, FindMedianSolution.findMedianSortedArrays(nums1, nums2));
        nums1 = new int[] {1, 2, 3, 4};
        assertEquals(3.5, FindMedianSolution.findMedianSortedArrays(nums1, nums2));
    }
}