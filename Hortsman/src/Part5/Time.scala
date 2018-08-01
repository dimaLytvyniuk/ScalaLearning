package Part5

class Time(val hours:Int, val minutes:Int) {
  if (hours < 0 || hours > 23)
    throw new IllegalArgumentException("hours should be from 0 to 23")
  if (minutes < 0 || minutes > 60)
    throw new IllegalArgumentException("minutes should be from 0 to 60")

  def before(other: Time): Boolean = {
    if (hours > other.hours)
      false
    else if (hours < other.hours)
      true
    else if (minutes > other.minutes)
      false
    else
      true
  }
}
