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
    val person = new Person(10, "Bob Jungels")
    println(person.age)
    println(person.firtsName)
    println(person.lastName)

    val secondPerson = new Person(-8, "Merry Poppins")
    println(secondPerson.age)
    println(secondPerson.firtsName)
    println(secondPerson.lastName)
  }

  def eigthTask(): Unit = {
    val car1 = new Car("Mercedes", "E124")
    println(s"${car1.mark} ${car1.model} ${car1.year} ${car1.registrationNumber}")

    val car2 = new Car("Mercedes", "E124", 2009)
    println(s"${car2.mark} ${car2.model} ${car2.year} ${car2.registrationNumber}")

    val car3 = new Car("Mercedes", "E124", "KA 1422 TA")
    println(s"${car3.mark} ${car3.model} ${car3.year} ${car3.registrationNumber}")

    val car4 = new Car("Mercedes", "E124", 2012, "KA 1422 TA")
    println(s"${car4.mark} ${car4.model} ${car4.year} ${car4.registrationNumber}")
  }

  def tenthTask(): Unit = {
    val employee = new Employee
    println(s"${employee.name} ${employee.salary}")
  }

  secondTask()

  thirdTask()

  fifthTask()

  sixthTask()

  eigthTask()

  tenthTask()
}
