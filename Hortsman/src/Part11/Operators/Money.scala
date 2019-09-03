package src.Part11.Operators

class Money(val units: Int, val cents: Int) {
  val fullAmount = units * 100 + cents

  def +(other: Money): Money = {
    val sum = fullAmount + other.fullAmount
    new Money(sum / 100, sum % 100)
  }

  def -(other: Money): Money = {
    val sum = fullAmount - other.fullAmount
    new Money(sum / 100, sum % 100)
  }

  def *(course: Int): Money = {
    val sum = fullAmount * course
    new Money(sum / 100, sum % 100)
  }

  def ==(other: Money): Boolean = units == other.units && cents == other.cents
  def !=(other: Money): Boolean = ! this.==(other)

  override def toString: String = String.format("%d,%02d", units, cents)
}
