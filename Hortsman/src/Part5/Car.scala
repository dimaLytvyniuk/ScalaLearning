package Part5

class Car(val mark: String, val model: String) {
  private var _year = -1
  var registrationNumber = ""

  def this(mark: String, model: String, year: Int) {
    this(mark, model)
    this._year = year
  }

  def this(mark: String, model: String, registrationNumber: String) {
    this(mark, model)
    this.registrationNumber = registrationNumber
  }

  def this(mark: String, model: String, year: Int, registrationNumber: String) {
    this(mark, model, year)
    this.registrationNumber = registrationNumber
  }

  def year = _year
}
