package Part8

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  override def deposit(amount: Double): Double = {
    balance -= 1
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    balance -= 1
    super.withdraw(amount)
  }
}
