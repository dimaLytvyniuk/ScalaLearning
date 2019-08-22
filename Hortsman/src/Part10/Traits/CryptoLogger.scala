package src.Part10.Traits

class CryptoLogger extends Logger {
  def log(msg: String) = {
    log(msg, 3)
  }

  def log(msg: String, step: Int) = {
    var newMsg = caesarCipher(msg, step)
    println(newMsg)
  }

  def caesarCipher(msg: String, step: Int): String = {
    msg.map(x => (x + step).asInstanceOf[Char]);
  }
}
