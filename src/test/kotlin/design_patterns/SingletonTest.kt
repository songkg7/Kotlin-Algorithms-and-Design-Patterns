package design_patterns

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class SingletonTest {

    @Test
    fun test() {
        LocalData.addName("Twillight Sparkle")
        LocalData.addName("Starlight Glimmer")

        assertEquals(listOf("Twillight Sparkle", "Starlight Glimmer"), LocalData.names())
    }

}
