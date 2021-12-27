package au.edu.swin.sdmd.w02kotlindemo

val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")

fun main() {
  // eager, creates a new list
  println( decorations.filter {it[0] == 'p'})

  // lazy, will wait until asked to evaluate
  val filtered = decorations.asSequence().filter { it[0] == 'p' }
  println("filtered: $filtered")

  // force evaluation of the lazy list
  val newList = filtered.toList()
  println("new list: $newList")

  // lazy map
  val lazyMap = decorations.asSequence().map {
    println("access: $it")
    it
  }
  printSequence(lazyMap)

  // lazy map2
  val lazyMap2 = decorations.asSequence().filter{it[0] == 'p'}.map {
    println("access: $it")
    it
  }
  printSequence(lazyMap2)

}

fun printSequence(lazyMap: Sequence<String>) {
  println("lazyMap: $lazyMap")
  println("first: ${lazyMap.first()}")
  println("all: ${lazyMap.toList()}")
}
