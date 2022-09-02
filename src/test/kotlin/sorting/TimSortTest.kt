package sorting

import TestUtils
import org.junit.Test
import org.junit.jupiter.api.Assertions

class TimSortTest {

    @Test
    fun test_reversed_array() {
        val expected = TestUtils.list(100000)

        val actual = expected.reversed().toTypedArray()
        actual.timSort()

        Assertions.assertEquals(expected, actual.toList())
    }

    @Test
    fun test_random_array() {
        val actual = TestUtils.randomArray(50000)

        val expected = actual.sorted()

        actual.timSort()

        Assertions.assertEquals(expected, actual.toList())
    }

    @Test
    fun test_shuffled_array() {
        val expected = TestUtils.sortedArray(100000)

        val actual = expected.copyOf()
        actual.shuffle()
        actual.timSort()

        Assertions.assertEquals(expected.toList(), actual.toList())
    }

    @Test
    fun test_sorted_array() {
        val actual = TestUtils.sortedArray(100000)

        val expected = actual.toList()

        actual.timSort()

        Assertions.assertEquals(expected, actual.toList())
    }

}
