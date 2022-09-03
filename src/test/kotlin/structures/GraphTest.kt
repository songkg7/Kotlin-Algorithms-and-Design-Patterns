package structures

import org.junit.Test
import org.junit.jupiter.api.Assertions.assertEquals

internal class GraphTest {

    @Test
    fun test_add_and_remove_vertexes() {
        val graph = Graph<Int>()

        graph.addVertex(10)
        graph.addVertex(20)
        graph.addVertex(30)

        graph.addEdge(10, 20)
        graph.addEdge(10, 30)
        graph.addEdge(20, 30)

        graph.removeVertex(10)

        assertEquals(listOf(Vertex(20), Vertex(30)), graph.breadthFirstTraversal())
    }

    @Test
    fun test_empty() {
        val graph = Graph<Int>()

        graph.addVertex(10)
        graph.addVertex(20)
        graph.addVertex(30)

        graph.addEdge(10, 20)
        graph.addEdge(10, 30)
        graph.addEdge(20, 30)

        graph.removeVertex(10)
        graph.removeVertex(20)
        graph.removeVertex(30)

        val expected: List<Vertex<Int>> = listOf()
        assertEquals(expected, graph.breadthFirstTraversal())
    }

    @Test
    fun test_depth_first_traversal() {
        val graph = Graph<Int>()

        graph.addVertex(10)
        graph.addVertex(20)
        graph.addVertex(30)

        graph.addEdge(10, 20)
        graph.addEdge(20, 30)
        graph.addEdge(30, 10)

        assertEquals(listOf(Vertex(10), Vertex(20), Vertex(30)), graph.depthFirstTraversal())
    }

    @Test
    fun test_breadth_first_traversal() {
        val graph = Graph<Int>()

        graph.addVertex(10)
        graph.addVertex(20)
        graph.addVertex(30)
        graph.addVertex(40)

        graph.addEdge(10, 20)
        graph.addEdge(20, 30)
        graph.addEdge(20, 40)

        assertEquals(
            listOf(Vertex(10), Vertex(20), Vertex(30), Vertex(40)),
            graph.breadthFirstTraversal()
        )
    }

}
