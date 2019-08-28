package src.Part10.Traits

import java.io.InputStream

class IterableInputStream extends InputStream with BufferedInputStream with Iterator[Byte] {
  override def hasNext: Boolean = ???

  override def next(): Byte = ???
}
