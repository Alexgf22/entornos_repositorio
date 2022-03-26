import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ej62KtTest() {
    @Test

    fun testImporte() {
        assert(importe(10) == arrayListOf(1,9))
    }
}