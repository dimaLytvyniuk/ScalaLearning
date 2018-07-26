package Part5

class BankAccount {
  private var _balance = 0

  def balance = _balance

  def withdraw(sum: Int): Int = {
    if (sum > _balance)
      return -1

    _balance -= sum

    return balance
  }

  def deposit(sum: Int): Int = {
    if (sum <= 0)
      return -1

    _balance += sum

    return balance
  }
}
