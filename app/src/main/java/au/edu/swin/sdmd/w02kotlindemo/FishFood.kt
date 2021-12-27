package au.edu.swin.sdmd.w02kotlindemo

import java.util.*

fun main(args : Array<String>) {
  feedTheFish()
}

fun feedTheFish() {
  val day = randomDay()
/* v1.0
  val food = "pellets"
*/
//  v2.0
  val food = fishFood(day)
  println("Today is $day and the fish eat $food")
}

fun fishFood(day: String): String {
  // v1.0: var food = "nothing"
  val food : String
  when (day) {
    "Monday" -> food = "flakes"
    "Tuesday" -> food = "pellets"
    "Wednesday" -> food = "redworms"
    "Thursday" -> food = "granules"
    "Friday" -> food = "mosquitoes"
    "Saturday" -> food = "lettuce"
    "Sunday" -> food = "plankton"
    else -> food = "nothing"
  }

  return food
}

fun randomDay(): String {
  val week = arrayOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
  return week[Random().nextInt(week.size)]
}

