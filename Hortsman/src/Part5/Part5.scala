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

  def thirdTask(): Unit = {
    val time = new Time(20, 30)
    val time2 = new Time(23, 34)
    val time3 = new Time(8, 9)
    val time4 = new Time(20, 40)

    println(s"${time.hours} ${time.minutes}")
    println(time.before(time2))
    println(time.before(time3))
    println(time.before(time4))
  }

  def fifthTask(): Unit = {
    val student = new Student("Bob", 1234)

    student.name = "Alisa"
    student.id = 29202
    println(s"${student.name} ${student.id}")

    student.setName("Bobisa")
    student.setId(98767)
    println(s"${student.getName} ${student.getId}")
  }

  def sixthTask(): Unit = {
    val person = new Person(10)
    println(person.age)

    val secondPerson = new Person(-8);
    println(secondPerson.age)
  }

  secondTask()

  thirdTask()

  fifthTask()

  sixthTask()
}
