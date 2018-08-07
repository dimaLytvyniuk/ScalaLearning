package Part5

class Person(private var _age: Int, name: String) {
  if (_age < 0)
    _age = 0;

  val firtsName = name.split(" ")(0)
  val lastName = name.split(" ")(1)

  def age = _age
  def age_=(newValue: Int): Unit = {
    if (newValue > _age)
        _age = newValue
  }
}
