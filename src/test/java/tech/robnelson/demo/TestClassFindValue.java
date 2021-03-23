package tech.robnelson.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.ArrayList;

public class TestClassFindValue {
    static int MAX_VALUE = 12;
    static int MIN_VALUE = -13;
    static int MAX_PRODUCT = 117; // -13 * -7
    static int DUAL_PRODUCT = 81; // -9 * -9

    static int values[] = { 9, MAX_VALUE, MIN_VALUE, 4, 3, 1, 4, -7, 5, 6, 8 };
    static int empty[] = {};

    static int productTest[] = { -9, 12, MIN_VALUE, 4, 3, 1, 4, 7, 5, 6, 8 };
    static int productTest1[] = { -9 };
    static int productTest2[] = { -9, -9 };
    static int productTest3[] = {};

    static int target1 = 9;
    static Integer result1[] = { 0, 1 };
    static ArrayList<Integer> results1 = new ArrayList<>(Arrays.asList(result1));
    static Integer numbers[] = { 2, 7, 11, 15 };
    static ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(numbers));
    static Integer result2[] = { 2, 3 };
    static ArrayList<Integer> results2 = new ArrayList<>(Arrays.asList(result2));
    static int target2 = 26;

    @Test
    public void TestFindMaxValue() {
        assertEquals(MAX_VALUE, FindValue.findMax(values));
    }

    @Test
    public void TestFindMaxValueEmptyInput() {
        assertThrows(NoSuchElementException.class, () -> {
            FindValue.findMax(empty);
        });
    }

    @Test
    public void TestFindMinValue() {
        assertEquals(MIN_VALUE, FindValue.findMin(values));
    }

    @Test
    public void TestFindMinValueEmptyInput() {
        assertThrows(NoSuchElementException.class, () -> {
            FindValue.findMin(empty);
        });
    }

    @Test
    public void TestFindMaxProduct() {
        assertEquals(MAX_PRODUCT, FindValue.findMaxProduct(productTest));
    }

    @Test
    public void TestFindMaxProductSingle() {
        assertEquals(FindValue.DEFAULT, FindValue.findMaxProduct(productTest1));
    }

    @Test
    public void TestFindMaxProductDual() {
        assertEquals(DUAL_PRODUCT, FindValue.findMaxProduct(productTest2));
    }

    @Test
    public void TestFindMaxProductEmpty() {
        assertEquals(FindValue.DEFAULT, FindValue.findMaxProduct(productTest3));
    }

    @Test
    public void TestTwoSum() {
        ArrayList<Integer> result = FindValue.twoSum(nums, target1);
        assertTrue(result.equals(results1));
    }

    @Test
    public void TestTwoSum001() {
        ArrayList<Integer> result = FindValue.twoSum(nums, target2);
        assertTrue(result.equals(results2));
    }
}
