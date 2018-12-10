//data stuctures

//Creating a data class
data class Person(val name: String) {
    var age: Int = 0
}

fun main(args: Array<String>) {

	//demonstrates list data stuctures of which one is mutable
	//while one collection is immutable
	val numbers: MutableList<Int> = mutableListOf(1, 2, 3)
	val readOnlyView: List<Int> = numbers
	println(numbers)        // prints "[1, 2, 3]"
	numbers.add(4)
	println(readOnlyView)   // prints "[1, 2, 3, 4]"
	//readOnlyView.clear()    // -> does not compile

	//creates a hash table
	val strings = hashSetOf("a", "b", "c", "c")
	assert(strings.size == 3)

	//demonstrates modification of lists using functions
	val items = listOf(1, 2, 3, 4)
	items.first() == 1 //boolean expression included in the std library
	items.last() == 4
	items.filter { it % 2 == 0 }   // returns [2, 4]

	val rwList = mutableListOf(1, 2, 3)
	rwList.requireNoNulls()        // returns [1, 2, 3]
	if (rwList.none { it > 6 }) println("No items above 6")  // prints "No items above 6"
	val item = rwList.firstOrNull()

	val readWriteMap = hashMapOf("foo" to 1, "bar" to 2)
	println(readWriteMap["foo"])  // prints "1"

	//assigning values to data class
	val person1 = Person("John")
	val person2 = Person("John")
	person1.age = 10
	person2.age = 20

}