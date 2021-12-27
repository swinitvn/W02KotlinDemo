package au.edu.swin.sdmd.w02kotlindemo

fun main() {
  val waterFilter =
    // lambda function
    { dirty : Int -> dirty / 2}
  // using lambda function
  var dirtyLevel = 20
  println(waterFilter(dirtyLevel))

  // lambda function (2)
  val waterFilter2 : (Int) -> Int = { dirty -> dirty / 4}
  println(waterFilter2(dirtyLevel))

  /** high-order function: using lambdas*/
  println(updateDirty(dirtyLevel, waterFilter))

  // sometime later: change the filtering function
  println(updateDirty(dirtyLevel, waterFilter2))

  /** high-order function: using normal function */
  println(updateDirty(dirtyLevel, ::increaseDirt))

  /* high-order function: last-parameter call syntax:
    lambda does not need to be put inside parentheses
  * */
  val dirt =
    // updateDirty(dirtyLevel, { dirtyLevel -> dirtyLevel + 23})
    // is SIMPLIFED to:
    updateDirty(dirtyLevel) { dirtyLevel -> dirtyLevel + 23}
  println("last param syntax: $dirt")
}

fun updateDirty(dirty: Int, opt: (Int) -> Int): Int {
  return opt(dirty)
}

// compact function
fun increaseDirt(dirt: Int): Int = dirt + 1
