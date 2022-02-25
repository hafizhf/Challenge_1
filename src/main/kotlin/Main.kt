/*------------------------------------------------------------.
/                    CHALLENGE CHAPTER 1                      /
'------------------------------------------------------------/

>>> Program : Piramida Bintang
>>> Nama    : Hafizh Firdaus Yuspriana
>>> Kelas   : AND - 5

>>> Android Engineering - Binar Academy - MBKM Batch 2

Cara menggunakan : Run Main.kt
------------------------------------------------------------ */

import java.lang.Double.parseDouble

fun main(args: Array<String>) {

    var choose_menu: Boolean = false
    var quit : Boolean = false
    var pilih_menu: String? = null

    var input_baris : String? = null
    var input : Int

    while (quit != true) {

        println("\n==========================")
        println(" Program Piramida Bintang")
        println("==========================\n")

        println("1. Piramida")
        println("2. Piramida Terbalik")
        println("3. Piramida (siku-siku)")
        println("4. Piramida Terbalik (siku-siku)")
        println("5. Belah ketupat")
        println("6. Bintang X")
        println("7. Bintang +\n")

        // Init untuk input pilih menu
        choose_menu = false
        pilih_menu = null

        while (choose_menu != true || pilih_menu == null) {
            print("Pilih nomor untuk melihat: ")
            pilih_menu = readLine()!!.toString()

            choose_menu = isNum(pilih_menu)
        }

        // Init untuk input tinggi piramida
        choose_menu = false
        input_baris = null

        while (choose_menu != true || input_baris == null) {
            print("Tinggi piramida: ")
            input_baris = readLine()!!.toString()

            choose_menu = isNum(input_baris)
        }

        input = input_baris.toInt()

        if (pilih_menu != null) {
            when(pilih_menu.toInt()) {
                1 -> segitiga(input)
                2 -> segitiga_terbalik(input)
                3 -> segitia_sikusiku(input)
                4 -> segitia_sikusiku_terbalik(input)
                5 -> belahketupat(input)
                6 -> bintang_x(input)
                7 -> bintang_plus(input)
            }
        }

        print("Lihat bentuk lain? [Y/N] : ")
        val loop = readLine()!!.toString()

        if (loop == "N" || loop == "n") {
            quit = true
        }
    }
}

fun isNum(input : String) : Boolean {
    var isNumeric : Boolean = true

    try {
        val num = parseDouble(input)
    } catch (e: java.lang.NumberFormatException) {
        isNumeric = false
    }

    if (isNumeric != true) {
        return false
    } else {
        return true
    }
}