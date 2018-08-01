package Part5

class Counter {
  private var value = 0

  def increment() {
    if (value < Int.MaxValue)
      value += 1
    else
      println("Overflow counter")
  }

  def current = value
}
