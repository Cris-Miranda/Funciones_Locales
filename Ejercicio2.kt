package Funciones_Locales

fun mostrarMayor() {
    fun mayor (x1: Int, x2: Int) = if (x1 > x2) x1 else x2
    for(i in 1..5) {
        print("Ingrese primer valor:")
        val valor1 = readln().toInt()
        print("Ingrese segundo valor:")
        val valor2 = readln().toInt()
        println("El mayor entre $valor1 y $valor2 es ${mayor(valor1, valor2)}")
    }
}
fun main(parametro: Array<String>) {
    mostrarMayor()
}