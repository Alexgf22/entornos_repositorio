fun coste(horas: Int, precio: Double) : Double {
    return horas * precio
}

fun main() {
    print("Horas de trabajo: ")
    var horas = readln().toInt()
    print("Coste: ")
    var precio = readln().toDouble()
    print("El coste total es de: ${horas}, ${precio} ")
}
