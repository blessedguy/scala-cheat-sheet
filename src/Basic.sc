// Variable - Implicit Type
var myVar = 1

// Variable - Explicit Type
var myOtherVar: Int = 1

// Constant - Implicit Type
val myVal = "String"

// Constant - Explicit Type
val myOtherVal: String = "String"

// String interpolation
val myString = s"myVar is $myVar"
val myOtherString = s"myOtherVar is ${myOtherVar}"

val myMultilineString =
  s"""myVal is $myVal
myOtherVal is ${myOtherVal}
Expression inside String: ${math.pow(2, 2)}"""

// Formatting Strings

val myFormattingString = f"X.XX: ${Math.pow(5, 2)}%1.2f"

// Raw Strings
val myRawString = raw"This is a raw String. \n No new line!"
val myRawMultiline =
  raw"""hey.
This is a raw multiline string. \n\n\n No new line here.
Newline here."""

// Char
val myChar = 'a'

// Math works just like Java

val mySum = 1 + 1
val mySub = 1 - 1
val myMult = 2 * 1
val myIntDiv = 5 / 2
val myDoubleDiv = 5.0 / 2
val myMod = 10 % 3

// Collections
val myAnyArray = Array(1, 'a', "String")
val myIntArray = Array(1, 2, 3)

val mySet = Set(1, 2, 3)
val myMap = Map(1 -> "One", 2 -> "Two")

// Tuples

val myTuple: (Int, Int, Int) = (1, 2, 3)
val firstValue = myTuple._1

val myNestedTuple = ((1, 2), (3, 4))
val myDeepValue = myNestedTuple._1._1

// Calling a function
println("Hello World!")

// Defining a function
def square(x: Int): Int = x * x

def sumOfSquares(x: Int, y: Int): Int = {
  val xSquared = square(x)
  val ySquared = square(y)

  xSquared + ySquared
}

println(s"Without parameter names: ${sumOfSquares(2, 3)}")
println(s"With parameter names: ${sumOfSquares(y = 3, x = 2)}")
println(s"If mixed, order matters for unnamed: ${sumOfSquares(2, y = 3)}")

// Function with default parameters

def multiplyWithDefault(x: Int, y: Int = 1): Int = x * y

println(s"Using default: ${multiplyWithDefault(10)}")
println(s"Not using default: ${multiplyWithDefault(10, 2)}")


// Function with implicit type
def sum(x: Int, y: Int) = x + y

// Lambda/Anonymous Function

val lambdaSquare: Int => Int = x => x * x
val lambdaSum: (Int, Int) => Int = (x, y) => x + y
val lambdaMult: (Int, Int) => Int = (x, y) => {
  x * y
}

// If param is used only once, can be ommited and replaced by _
val addOne: Int => Int = _ + 1
val uglySum: (Int, Int) => Int = _ + _

// Ranges
val myRange = 1 to 5
myRange.foreach(println)

val myRangeByTwo = 1 to 5 by 2
myRangeByTwo.foreach((x: Int) => println(s"x = $x"))

// while

var i = 0
while (i < 5) {
  println(i)
  i = addOne(i)
}

// do while

i = 0
do {
  println(i)
  i = addOne(i)
} while (i < 5)
