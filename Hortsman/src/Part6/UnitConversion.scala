package Part6

abstract class UnitConversion {
  def convert(value: Double): Double
}

object InchesToCentimeters extends UnitConversion {
  override def convert(value: Double): Double = value * 2.54
}

object GallonsToLiters extends UnitConversion {
  override def convert(value: Double): Double = value * 3.78541
}

object MilesToKilometers extends UnitConversion {
  override def convert(value: Double): Double = value * 1.60934
}