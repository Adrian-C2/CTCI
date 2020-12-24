package Algorithms.Sorting;

import org.junit.Assert;
import org.junit.Test;

public class QuickSortTest {
    QuickSort tester = new QuickSort();

    @Test
    public void sortTest1() {
        Assert.assertArrayEquals(tester.sort(new int[]{9, 3, 4, 6, 1, 2, 5, 8, 7}), new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void sortTest2() {
        Assert.assertArrayEquals(tester.sort(new int[]{9, 3, 4, 6, 1, 1, 5, 8, 7}), new int[]{1, 1, 3, 4, 5, 6, 7, 8, 9});
    }

    @Test
    public void sortTest3() {
        Assert.assertArrayEquals(tester.sort(new int[]{8,8,3,1,5,4}), new int[]{1,3,4,5,8,8});
    }
}