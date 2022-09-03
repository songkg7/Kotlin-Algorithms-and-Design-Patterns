package other

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class FactorialTest {

    private val factorial = Factorial()

    @Test
    fun test_iterative() {
        assertEquals(1, factorial.compute(0))
        assertEquals(1, factorial.compute(1))
        assertEquals(6, factorial.compute(3))
        assertEquals(120, factorial.compute(5))
        assertEquals(720, factorial.compute(6))
    }

    @Test
    fun test_recursive() {
        assertEquals(1, factorial.computeRecursive(0))
        assertEquals(1, factorial.computeRecursive(1))
        assertEquals(6, factorial.computeRecursive(3))
        assertEquals(120, factorial.computeRecursive(5))
        assertEquals(720, factorial.computeRecursive(6))
    }

    @Test
    fun test_recursive_with_kotlin_optimization() {
        assertEquals(1, factorial.computeRecursiveWithKotlinOptimization(0))
        assertEquals(1, factorial.computeRecursiveWithKotlinOptimization(1))
        assertEquals(6, factorial.computeRecursiveWithKotlinOptimization(3))
        assertEquals(120, factorial.computeRecursiveWithKotlinOptimization(5))
        assertEquals(720, factorial.computeRecursiveWithKotlinOptimization(6))
    }


}
