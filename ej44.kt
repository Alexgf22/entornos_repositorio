fun suma ( numeros : List<Int>) : ArrayList<Int>{
    var positivo : Int = 0
    var negativo : Int = 0
    for (n in numeros){
        if (n > 0){
            positivo += 1
        }
        else if (n < 0){
            negativo += 1
        }
    }
    return arrayListOf(positivo, negativo, numeros.sum())
}



