package Part8

class SavingsAccount(initialBalance: Double) extends BankAccount(initialBalance) {
  private var countOfTransactions = 0

  override def deposit(amount: Double): Double = {
    withdrawCommision()
    super.deposit(amount)
  }

  override def withdraw(amount: Double): Double = {
    withdrawCommision()
    super.withdraw(amount)
  }

  def earnMonthlyInterest(percentage: Double): Double = {
    countOfTransactions = 0
    balance += balance * (percentage / 100)
    balance
  }

  private def withdrawCommision() = {
    countOfTransactions += 1
    if (countOfTransactions > 3) {
      balance -= 1
    }
  }
}
