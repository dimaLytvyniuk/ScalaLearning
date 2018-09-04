package Part6

object Suit extends Enumeration {
  type Suit = Value

  val Diamonds = Value("♦")
  val Clubs = Value("♣")
  val Hearts = Value("♥")
  val Spades = Value("♠")

  def isRed(suit: Suit): Boolean = (suit == Diamonds) || (suit == Hearts)
}