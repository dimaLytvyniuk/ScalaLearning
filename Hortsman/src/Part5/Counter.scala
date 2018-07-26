package Part5

class Counter {
  private var value = 0

  def increment() {
    if (value == Int.MaxValue)
      println("Overflow counter")

    value+= 1
  }

  def current = value
}
