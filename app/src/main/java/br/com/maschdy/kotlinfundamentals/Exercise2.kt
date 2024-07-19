package br.com.maschdy.kotlinfundamentals

fun main() {
    var num = 10
    IsNumEvenOrOdd(num)
    num = 7
    IsNumEvenOrOdd(num)

    num = 10
    IsNumEvenOrOddWithWhen(num)
    num = 7
    IsNumEvenOrOddWithWhen(num)
}

fun IsNumEvenOrOdd(num: Int) {
    if (num % 2 == 0) {
        println("O número é par")
    } else {
        println("O número é impar")
    }
}

fun IsNumEvenOrOddWithWhen(num: Int) {
    when(num % 2 == 0) {
        true -> println("O número é par")
        false -> println("O número é impar")
    }
}
