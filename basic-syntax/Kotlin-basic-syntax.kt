// This is an end-of-line comment

/* This is a block comment
	on multiple lines. */

//Defining packages
package my.demo

import java.util.*

//Defining variables

val a: Int = 1  // immediate assignment
val b = 2   // `Int` type is inferred
val c: Int  // Type required when no initializer is provided
c = 3       // deferred assignment

//Variables can be global and used in subscopes

val PI = 3.14
var x = 0

fun incrementX() { 
    x += 1 
}

//Defining functions
fun sum(a: Int, b: Int): Int {
    return a + b
}

fun main(args: Array<String>) {
	fun sum(a: Int, b: Int) = a + b

	//Variables can be overriden 

	var x = 5 // `Int` type is inferred
	x += 1
}