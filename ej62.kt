fun importe(importeFinal: Int) : ArrayList<Int>  {
    
    var ivaPagado = (importeFinal * 10)/100
    var importeSinIva = importeFinal - ivaPagado
    return arrayListOf(ivaPagado, importeSinIva)

}

fun main() {print("Introduzca el importe final de un artículo: ")
    var importeFinal = readln().toInt()
    print(importe(10))
}

