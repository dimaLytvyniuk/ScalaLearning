package Part5

class BankAccount {
  private var _balance = 0

  def balance = _balance

  def withdraw(sum: Int): Int = {
    if (sum > _balance)
      -1
    else {
      _balance -= sum

      balance
    }
  }

  def deposit(sum: Int): Int = {
    if (sum <= 0)
      -1
    else {
      _balance += sum

      balance
    }
  }
}
