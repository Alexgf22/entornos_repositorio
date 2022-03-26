fun es_bisiesto(year: Int): Boolean {

    while (true) {


        if (year % 4 != 0) {    // No sería divisible entre 4
            return false
        }
        else if ((year % 4 == 0) and (year % 100 != 0)) {   // Sería divisible entre 4 y no entre 100 o 400
            return true
        }
        else if ((year % 4 == 0) and (year % 100 == 0) and (year % 400 != 0)) {    // Sería divisible entre 4 y 100 y no entre 400
            return false
        }
        else if ((year % 4 == 0) and (year % 100 == 0) and (year % 400 == 0)) {   // Sería divisible entre 4, 100 y 400
            return true
        }


    }

}