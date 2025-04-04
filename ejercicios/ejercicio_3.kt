/*En este programa, se muestra el clima de diferentes ciudades. 
 Incluye el nombre de la ciudad, las temperaturas máxima y 
 mínima del día, y las probabilidades de lluvia
 */
fun main() {
    
    println(details("Ankara", 27, 31, 82))
	println()
    println(details("Tokyo", 32, 36, 10))
	println()
    println(details("Cape Town", 59, 64, 2))
	println()
    println(details("Guatemala City", 50, 55, 7))
	println()


}
fun details(city: String, lowTemp: Int, highTemp: Int, chanceRain: Int){
    println("City: $city")
    println("Low temperature:$lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceRain")
}


fun main() {
    
    println(details("Ankara", 27, 31, 82))
	println()
    println(details("Tokyo", 32, 36, 10))
	println()
    println(details("Cape Town", 59, 64, 2))
	println()
    println(details("Guatemala City", 50, 55, 7))
	println()


}
fun details(city: String, lowTemp: Int, highTemp: Int, chanceRain: Int){
    println("City: $city")
    println("Low temperature:$lowTemp, High temperature: $highTemp")
    println("Chance of rain: $chanceRain")
}
