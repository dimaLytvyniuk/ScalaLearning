package Part8

class BankAccount(initialBalance: Double) {
  protected var balance = initialBalance
  def deposit(amount: Double) = { balance += amount; balance}
  def withdraw(amount: Double) = { balance -= amount; balance}

  def checkBalance = balance
}
