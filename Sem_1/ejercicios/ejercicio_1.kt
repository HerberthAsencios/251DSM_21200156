fun main() {
    val firstNumber = 10
    val secondNumber = 5
    val thirdNumber = 8

    val result = add(firstNumber, secondNumber)
    val anotherResult = add(firstNumber, thirdNumber)
    
    val result_2 = subtract(firstNumber, secondNumber)
    val anotherResult_2 = subtract(firstNumber, thirdNumber)
	
    println("funcion add\n")
    println("$firstNumber + $secondNumber = $result")
    println("$firstNumber + $thirdNumber = $anotherResult")
    println("================================================")
    println("funcion subtract\n")
    println("$firstNumber - $secondNumber = $result_2")
    println("$firstNumber - $thirdNumber = $anotherResult_2")
}

// Define add() function below this line
fun add(num1: Int, num2: Int): Int{
	val result = num1 + num2
   return result
    
}
fun subtract(num1: Int, num2: Int): Int{
	val result = num1 - num2
   return result
    
}