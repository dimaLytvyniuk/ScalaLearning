package Part5

object Part5 extends App {
  def secondTask(): Unit = {
    val bankAccount = new BankAccount

    println(bankAccount.balance)
    bankAccount.deposit(100)
    println(bankAccount.balance)
    bankAccount.withdraw(50)
    println(bankAccount.balance)
  }

  secondTask()
}
