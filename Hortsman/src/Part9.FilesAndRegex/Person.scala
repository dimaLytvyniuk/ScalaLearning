package src.Part9.FilesAndRegex

import scala.collection.mutable.ArrayBuffer

class Person(val name: String, val age: Int) extends Serializable {
  private var _friends = new ArrayBuffer[Person];

  def friends = _friends

  def addFriend(person: Person): Unit = {
    _friends.addOne(person)
  }
}
