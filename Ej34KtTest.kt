import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ej34KtTest() {
    @Test

    fun testEj34() {
        assert(es_bisiesto(2020) == true)
    }

    @Test

    fun testEj342() {
        assert(es_bisiesto(2003) == false)
    }

    @Test

    fun testEj343() {
        assert(es_bisiesto(2012) == true)
    }
}