import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Ej47KtTest() {
    @Test

    fun TestNumerosEnteros() {
        assert(numeros_enteros(12,2) == arrayListOf<Int>(6,0))
    }

    @Test

    fun TestNumerosEnteros2() {
        assert(numeros_enteros(25,5) == arrayListOf<Int>(5,0))
    }


}

