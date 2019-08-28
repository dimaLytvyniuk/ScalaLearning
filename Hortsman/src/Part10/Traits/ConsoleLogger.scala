package src.Part10.Traits

trait ConsoleLogger {
  def log(msg: String): Unit = {
    println(msg)
  }
}
