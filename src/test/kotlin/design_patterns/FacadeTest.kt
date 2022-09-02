package design_patterns

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class FacadeTest {

    @Test
    fun test() {
        val facade = Repository(LocalDataSource(), NetworkDataSource())
        val data = facade.fetch()
        assertEquals(listOf("Harry Potter", "Ronald Weasley", "Hermione Granger"), data)
    }
}
