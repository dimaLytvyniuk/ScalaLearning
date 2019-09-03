package src.Part11.Operators

class Fraction(val n: Int, val d: Int) {
  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d)
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d)

  def sign(a: Int) = if (a > 0) 1 else if (a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int = if (b == 0) Math.abs(a) else gcd(b, a % b)

  def *(other: Fraction) = new Fraction(num * other.num, den * other.den)
  def /(other: Fraction) = new Fraction(num / other.num, den / other.den)
  def -(other: Fraction) = new Fraction(num * other.den - other.num * den, den * other.den).optimize()
  def +(other: Fraction) = new Fraction(num * other.den + other.num * den, den * other.den).optimize()

  def optimize():Fraction = {
    val currGcd = gcd(num, den)
    new Fraction(num / currGcd, den / currGcd)
  }

  override def toString: String = num + "/" + den
}
