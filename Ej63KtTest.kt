import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ej63KtTest() {
    @Test

    fun testEj63() {
        assert(nota(10.0) == "Sobresaliente")
    }

    @Test

    fun testEj632() {
        assert(nota(6.5) == "Bien")
    }

    @Test

    fun testEj633() {
        assert(nota(7.8) == "Notable")
    }
}