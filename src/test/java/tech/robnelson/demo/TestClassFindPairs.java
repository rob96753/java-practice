package tech.robnelson.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.Arrays;
import java.util.NoSuchElementException;
import java.util.ArrayList;


public class TestClassFindPairs {
    String firstTest = "axa";
    private int FIRST_TEST_COUNT = 1;
    String secondTest = "aaxa";
    private int SECOND_TEST_COUNT = 1;
    String thirdTest = "axbxaxabbbab";  // x-b-x x-a-x b-a-b
    private int THIRD_TEST_COUNT = 5;
    String forthTest = "xbxaxababab";   // x-b-x x-a-x a-x-a a-b-a b-a-b a-b-a b-a-b
    private int FORTH_TEST_COUNT = 7;

    String fifthTest = "xxbxxbxxabxabab";   // xx-b-xx  xb-x-xb bx-x-bx xx-b-xx xa-b-xa ab-x-ab
    private int FIFTH_TEST_COUNT = 6;

    private static FindPairs findPairs;
    private static FindPairs findPairs5;

    @BeforeAll
    public static void SetUp() {
        findPairs = new FindPairs();
        findPairs5 = new FindPairs(5);

    }

    @Test
    public void TestFindPairsSimple() {
        assertEquals(FIRST_TEST_COUNT, findPairs.countPairs(firstTest));
    }

    @Test
    public void TestFindPairsSecond() {
        assertEquals(SECOND_TEST_COUNT, findPairs.countPairs(secondTest));
    }

    @Test
    public void TestFindPairsThird() {
        assertEquals(THIRD_TEST_COUNT, findPairs.countPairs(thirdTest));
    }

    @Test
    public void TestFindPairsFourth() {
        assertEquals(FORTH_TEST_COUNT, findPairs.countPairs(forthTest));
    }

    @Test
    public void TestFindPairsFifth() {
        assertEquals(FIFTH_TEST_COUNT, findPairs5.countPairs(fifthTest));
    }



}
