
fun nota(puntuacion: Double) : String {

    var resultado = ""
    if (puntuacion < 0.0 && puntuacion > 10.0) {
        resultado += "Tu nota es errónea"
    }
    if (puntuacion < 5.0) {
        resultado += "Insuficiente"
    }
    if (puntuacion >= 5.0 && puntuacion < 6.0) {
        resultado += "Suficiente"
    }
    if (puntuacion >= 6.0 && puntuacion < 7.0) {
        resultado += "Bien"
    }
    if (puntuacion >= 7.0 && puntuacion < 9.0) {
        resultado += "Notable"
    }
    if (puntuacion in 9.0..10.0) {
        resultado += "Sobresaliente"
    }
    return resultado
}

fun main() {
    print("Introduzca una puntuación entre 0.0 y 10.0: ")
    var puntuacion = readln().toDouble()
    print(nota(10.0))


}