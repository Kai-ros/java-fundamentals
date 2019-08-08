package basiclibrary;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static basiclibrary.Lab03.hashSet;
import static basiclibrary.Lab03.tally;
import static org.junit.Assert.*;

public class Lab03Test {

    // Hash set test cases.
    int[][] testArrayHappyPath = {
            {66, 64, 58, 65, 71, 57, 60},
            {57, 65, 65, 70, 72, 65, 51},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };
    int[][] testArrayEmpty = {{}};
    int[][] testArrayMissingData = {
            {66, 64, 58, 65, 71, 57, 60},
            {55, 54, 60, 53, 59, 57, 61},
            {65, 56, 55, 52, 55, 62, 57}
    };

    // Tally test cases.
    List<String> testListHappyPath = new ArrayList<>();
    List<String> testListEmpty = new ArrayList<>();
    List<String> testListDifferentData = new ArrayList<>();

    @Before
    public void testTallyHappyPathDataBuilder() {
        testListHappyPath.add("Bush");
        testListHappyPath.add("Bush");
        testListHappyPath.add("Bush");
        testListHappyPath.add("Shrub");
        testListHappyPath.add("Hedge");
        testListHappyPath.add("Shrub");
        testListHappyPath.add("Bush");
        testListHappyPath.add("Hedge");
        testListHappyPath.add("Bush");
    }

    @Before
    public void testTallyDifferentDataBuilder() {
        testListDifferentData.add("Bush");
        testListDifferentData.add("Shrub");
        testListDifferentData.add("Bush");
        testListDifferentData.add("Shrub");
        testListDifferentData.add("Hedge");
        testListDifferentData.add("Shrub");
        testListDifferentData.add("Bush");
        testListDifferentData.add("Hedge");
        testListDifferentData.add("Shrub");
    }

    @Test
    public void testHashSet() {
        assertEquals(
                "Method should return the desired happy path output.",
                "High: 72\n" +
                        "Low: 51\n" +
                        "Never saw temperature: 63\n" +
                        "Never saw temperature: 67\n" +
                        "Never saw temperature: 68\n" +
                        "Never saw temperature: 69\n",
                hashSet(testArrayHappyPath)
        );
    }

    @Test
    public void testHashSet_EmptyInputArray() {
        assertEquals(
                "Method should return a 0 if the data set is empty.",
                "0",
                hashSet(testArrayEmpty)
        );
    }

    @Test
    public void testHashSet_MissingData() {
        assertEquals(
                "Method should return the correct missing data output.",
                "High: 71\n" +
                        "Low: 52\n" +
                        "Never saw temperature: 63\n" +
                        "Never saw temperature: 67\n" +
                        "Never saw temperature: 68\n" +
                        "Never saw temperature: 69\n" +
                        "Never saw temperature: 70\n",
                hashSet(testArrayMissingData)
        );
    }

    @Test
    public void testTally() {
        assertEquals(
                "Method should return the desired happy path output.",
                "Bush received the most votes!",
                tally(testListHappyPath)
        );
    }

    @Test
    public void testTally_EmptyInputList() {
        assertEquals(
                "Method should return a 0 if the data set is empty.",
                "0",
                tally(testListEmpty)
        );
    }

    @Test
    public void testTally_DifferentInputList() {
        assertEquals(
                "Method should return the desired different data output.",
                "Shrub received the most votes!",
                tally(testListDifferentData)
        );
    }
}

