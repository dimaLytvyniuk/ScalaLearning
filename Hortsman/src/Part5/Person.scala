package Part5

class Person(private var _age: Int) {
  if (_age < 0)
    _age = 0;

  def age = _age
  def age_=(newValue: Int): Unit = {
    if (newValue > _age)
        _age = newValue
  }
}
