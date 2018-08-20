package Part6

abstract class UnitConversation {
  def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversation {
  override def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversation {
  override def convert(value: Double): Double = value * 3.78541
}

object MilesToKilometers extends UnitConversation {
  override def convert(value: Double): Double = value * 1.60934
}