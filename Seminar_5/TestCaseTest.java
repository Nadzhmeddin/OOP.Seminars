package Seminar_5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class TestCaseTest {

    @Test
    void testMove1() {
        TestCase testCase = new TestCase();

        List<Integer> from = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Integer> to = new ArrayList<>(Arrays.asList(4, 5, 6));

        testCase.move(from,to);

        Assertions.assertEquals(0, from.size());
        Assertions.assertEquals(6,to.size());
        // 4 5 6 1 2 3
//        Assertions.assertTrue(to.contains(1));
//        Assertions.assertTrue(to.contains(2));
//        Assertions.assertTrue(to.contains(3));
//        Assertions.assertTrue(to.contains(4));
//        Assertions.assertTrue(to.contains(5));
//        Assertions.assertTrue(to.contains(6));

        Assertions.assertEquals(0, to.indexOf(4));
        Assertions.assertEquals(1, to.indexOf(5));
        Assertions.assertEquals(2, to.indexOf(6));
        Assertions.assertEquals(3, to.indexOf(1));
        Assertions.assertEquals(4, to.indexOf(2));
        Assertions.assertEquals(5, to.indexOf(3));
    }

    @Test
    void testRemoveSpacesToUpperCase1() {
        TestCase testObject = new TestCase();

        String data = "abcdeOSDSF waweaw waewa wadaw awdasdasdasd";

        String result = testObject.removeSpacesToUpperCase(data);

        Assertions.assertEquals("ABCDEOSDSFWAWEAWWAEWAWADAWAWDASDASDASD", result);
    }

    @Test
    void testRemoveSpacesToUpperCase2() {
        TestCase testObject = new TestCase();

        String data = "      ";

        String result = testObject.removeSpacesToUpperCase(data);

        Assertions.assertEquals("", result);
    }
}