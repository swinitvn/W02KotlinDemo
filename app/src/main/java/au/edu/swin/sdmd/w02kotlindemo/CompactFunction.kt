package au.edu.swin.sdmd.w02kotlindemo

fun isTooHot(temp: Int) = temp > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater(day: String, temp: Int = 22, dirty: Int = 20) =
  when {
    isTooHot(temp) -> true
    isDirty(dirty) -> true
    isSunday(day) -> true
    else -> false
  }

fun main(args: Array<String>) {
  println("Change water: ${ shouldChangeWater( day = "Sunday")}")
  println("Change water: ${ shouldChangeWater( day = "Monday", temp = 29)}")
}