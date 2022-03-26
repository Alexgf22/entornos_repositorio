

fun numeros_enteros (dividendo: Int, divisor: Int): ArrayList<Int>  {
    var cociente = dividendo / divisor
    var resto = dividendo % divisor


    return arrayListOf<Int>(cociente,resto)
}

fun main() {
    print("Introduce el dividendo: ")
    var dividendo = readln().toInt()
    print("Introduce el divisor: ")
    var divisor = readln().toInt()

    println(numeros_enteros(12,2) )
}
