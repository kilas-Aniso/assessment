fun main() {
num()
    words()

val total = Calculator()
    total.addition(25,5)
    total.subtraction(25,5)
    total.division(25,5)
    total.multiplication(25,5)
}

/*
2. Write and invoke one function that takes in an array of integers and returns
these 3 values: smallest, largest and average of all the elements*/

fun num(){
    var num1 = arrayOf(45, 356, 67, 88)
//    smallest
    println(num1.min())
//    largest
    println(num1.max())
//    average
    println(num1.average())
}
/*
4.Write and call a function that takes in an array of strings, joins them all into
one string and returns it.*/

fun words(){
    var text = arrayOf("book", "pen", "chair")
    println(text[0]+text[1]+text[2])
}
/*
5. Create a calculator class that is capable of the following functions:
(i) Addition of any 2 numbers
(ii) Subtraction between any 2 numbers
(iii) Accurate division between any 2 numbers
(iv) Multiplication of any 2 numbers
Instantiate your calculator object and invoke all its functions

 */
class Calculator() {
    //    (i) Addition of any 2 numb
    fun addition(num1: Int, num2: Int) {
        var sum = num1 + num2
        println(sum)

    }

    //    (ii) Subtraction between any 2 numbers
    fun subtraction(num1: Int, num2: Int) {
      var result=  num1 - num2
println(result)

    }

    //    (iii) Accurate division between any 2 numbers
    fun division(num1: Int, num2: Int) {
        var answer =num1 % num2
        println(answer)
    }

    //    (iv) Multiplication of any 2 numbers
    fun multiplication(num1: Int, num2: Int) {
      var product =  num1 * num2
        println(product)
    }


    /*3. Write and call a function that takes in a string and splits it into all the
characters that constitute it. Your function should print out this output.*/
    fun stmt(word: String) {
        println(word[0])
        println(word[1])
        println(word[2])
        println(word[3])
        println(word[4])
    }
}

