package au.edu.swin.sdmd.w02kotlindemo

fun main() {
  val isUnit = println("This is an expression")
  println(isUnit)

  val temp = 10
  val isHot = if (temp > 50) true else false
  println("isHot = $isHot")

  val message = "The water temperature is ${ if (temp > 50) "too warm" else "OK" }. "
  println(message)
}