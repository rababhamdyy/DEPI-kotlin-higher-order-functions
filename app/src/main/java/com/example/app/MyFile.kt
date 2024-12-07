package com.example.app

fun main(){
    /* Assignment 1: Lambda Functions
    ● Create a list of integers.
    ● Use lambda functions to:
    - Filter out even numbers.
    - Map each number to its square.
    ● Display the results at each step. */

    val list = listOf(1,5,8,4,3,6,2)
    val filterList : (List<Int>) -> List<Int> = { filteredNum -> filteredNum.filter { (it % 2) != 0 } }
    println("  Origin list : $list \nfiltered list : ${filterList(list)}")

    val squareNumbers : (List<Int>) -> List<Int> = { squareNum -> squareNum.map { it * it }}
    println("Squared numbers : ${squareNumbers(list)} \n")

    /* Assignment 2: Higher-Order Functions
    ● Create a higher-order function transformList that takes a list of integers and a function that transforms an integer into another integer.
    ● Define different transformations using lambda expressions, such as doubling the number, squaring the number, and negating the number.
    ● Pass these transformations to transformList and display the results. */

    println("  Origin list : $list")
    println("Doubling list : " + transformList(list){
        doubleList -> doubleList.map { it * 2 }
    })

    println("Squaring list : " + transformList(list){
        squareList -> squareList.map { it * it }
    })

    println("Negating List : " + transformList(list){
        negateList -> negateList.map { it * -1 }
    })


}

fun transformList(list: List<Int> , transform: (List<Int>) -> List<Int>) :List<Int>{
    return transform(list)
}