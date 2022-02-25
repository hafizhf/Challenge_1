/*---------------------------------------------------
* Function Piramida Bintang
* --------------------------------------------------*/
fun segitiga(baris : Int) {
    for (i in 0 .. baris-1) {
        for (j in 1 .. baris - i){
            print("  ")
        }
        for (k in 0 .. i*2) {
            print("* ")
        }
        println("")
    }
}

/*---------------------------------------------------
* Function Piramida Bintang Terbalik
* --------------------------------------------------*/
fun segitiga_terbalik(baris : Int) {
    for (x in baris.downTo(1)) {
        for (y in baris downTo(x)) {
            print("  ")
        }
        for (z in 1 .. (x*2)-1) {
            print("* ")
        }
        println(" ")
    }
}

/*---------------------------------------------------
* Function Piramida Bintang (Siku-Siku)
* --------------------------------------------------*/
fun segitia_sikusiku(baris : Int) {
    for (i in 0 .. baris - 1) {
        for (j in 1 .. baris - i){
            print("")
        }
        for (k in 0 .. i) {
            print("* ")
        }
        println(" ")
    }
}

/*---------------------------------------------------
* Function Piramida Bintang Terbalik (Siku-Siku)
* --------------------------------------------------*/
fun segitia_sikusiku_terbalik(baris : Int) {
    for (i in 0 .. baris - 1) {
        for (j in 1 .. i){
            print("")
        }
        for (k in baris downTo i+1) {
            print("* ")
        }
        println(" ")
    }
}

/*---------------------------------------------------
* Function Piramida Bintang (Belah Ketupat)
* --------------------------------------------------*/
fun belahketupat(baris: Int) {
    for (i in 1 .. baris) {
        for (j in i .. baris) {
            print("  ")
        }
        for (k in 1 .. (i*2)-1) {
            print("* ")
        }
        println(" ")
    }

    for (x in 4.downTo(1)) {
        for (y in baris downTo(x)) {
            print("  ")
        }
        for (z in 1 .. (x*2)-1) {
            print("* ")
        }
        println("")
    }
    println(" ")
}

/*---------------------------------------------------
* Function Piramida Bintang X
* --------------------------------------------------*/
fun bintang_x(baris : Int) {
    for (i in 1 .. baris) {
        for (j in 1 .. baris) {
            if ((i == j) || (i+j == baris+1)) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println(" ")
    }
}

/*---------------------------------------------------
* Function Piramida Bintang Plus (+)
* --------------------------------------------------*/
fun bintang_plus(baris : Int) {
    for (i in 1 .. baris) {
        for (j in 1 .. baris) {
            if ((j == (baris/2)+1) || (i == (baris/2)+1)) {
                print("* ")
            } else {
                print("  ")
            }
        }
        println("")
    }
}