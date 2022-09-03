package other

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class PalindromeTest {

    @Test
    fun test_empty_string() {
        val text1 = ""
        assertEquals(Palindrome(text1).isYes(), true)
    }

    @Test
    fun test_one_length() {
        val text1 = "a"
        assertEquals(Palindrome(text1).isYes(), true)
    }

    @Test
    fun test_is_palindrome() {
        val text1 = "tenet"
        assertEquals(Palindrome(text1).isYes(), true)

        val text2 = "friend"
        assertEquals(Palindrome(text2).isYes(), false)
    }

    @Test
    fun test_is_not_palindrome() {
        val text1 = "white"
        assertEquals(Palindrome(text1).isNot(), true)

        val text2 = "tenet"
        assertEquals(Palindrome(text2).isNot(), false)
    }

}
