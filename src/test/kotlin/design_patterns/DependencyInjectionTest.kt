package design_patterns

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class DependencyInjectionTest {
    @Test
    fun test() {
        val service = NewsApiService()
        val repo = NewsRepository(service)
        val viewModel = NewsViewModel(repo)
        assertEquals(listOf("event 1", "event 2", "event 3"), viewModel.news)
    }
}
