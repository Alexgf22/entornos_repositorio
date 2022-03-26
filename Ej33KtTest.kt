import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class Ej33KtTest() {
    @Test
    fun testEj33() {
        assert(calculardistancia(1.0,1.0,1.0,1.0) == 0.0)
    }

    @Test
    fun testEj332() {
        assert(calculardistancia(3.5,3.5,5.0,5.0) == 2.1213203435596426)
    }
}