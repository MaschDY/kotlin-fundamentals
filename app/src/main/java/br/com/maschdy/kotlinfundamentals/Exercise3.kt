package br.com.maschdy.kotlinfundamentals

fun main() {
    val newArray = IntArray(40)
    for (i in newArray.indices) {
        newArray[i] = i
    }
    println(newArray.contentToString())

    val newList = mutableListOf<Int>()
    for (i in 1..99) {
        newList.add(i)
    }
    println(newList)

    var sum = 0
    for (i in newList.indices) {
        sum += newList[i]
    }
    println(sum)
}
