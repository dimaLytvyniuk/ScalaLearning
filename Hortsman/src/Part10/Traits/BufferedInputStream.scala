package src.Part10.Traits

import java.io.InputStream

import scala.collection.mutable.ArrayBuffer

trait BufferedInputStream extends ConsoleLogger with Iterator[Byte] {
  this: InputStream =>
  override def hasNext: Boolean = hasMore

  override def next(): Byte = this.read().asInstanceOf[Byte]

  var buffer = new ArrayBuffer[Byte]()
    var cursorIndex = 0
    var bufferSize = 5
    var hasMore = true

    override def read(): Int = {
      if (!hasMore) {
        -1
      } else {
        if (cursorIndex > (buffer.size - 1)) {
          val readed = this.readNBytes(bufferSize)
          buffer.addAll(readed)
          super.log(s"Readed from stream ${readed.length}")
        }

        if (cursorIndex > (buffer.size - 1)) {
          hasMore = false
          -1
        } else {
          cursorIndex += 1

          buffer(cursorIndex - 1)
        }
      }
    }
}
