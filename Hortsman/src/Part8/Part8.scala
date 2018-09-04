package Part8

object Part8 extends App {
  def firstTask() = {
    val checkingAccount = new CheckingAccount(100)

    checkingAccount.deposit(10)
    println(s"${checkingAccount.checkBalance}")

    checkingAccount.withdraw(10)
    println(s"${checkingAccount.checkBalance}")
  }

  def secondTask(): Unit = {
    val savingsAccount = new SavingsAccount(100)

    savingsAccount.deposit(10)
    println(s"${savingsAccount.checkBalance}")

    savingsAccount.withdraw(10)
    savingsAccount.deposit(10)

    savingsAccount.withdraw(10)
    println(s"${savingsAccount.checkBalance}")

    savingsAccount.earnMonthlyInterest(10)
    println(s"${savingsAccount.checkBalance}")
  }

  firstTask()

  secondTask()
}
