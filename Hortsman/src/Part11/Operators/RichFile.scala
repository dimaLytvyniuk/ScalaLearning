package src.Part11.Operators

class RichFile(fullPath: String) {
  private val splitedPath = fullPath.split("/")
  private val fileWithExtension = splitedPath(splitedPath.length - 1).split("\\.")

  val fileName = fileWithExtension(0)
  val fileExtension = fileWithExtension(1)
  val path = fullPath.substring(0, fullPath.length - fileWithExtension.mkString("").length - 1)

  def unapply(arg: RichFile): Option[String] = Some(path)
}

object RichFile {
  //def unapply(arg: RichFile): Option[(String, String, String)] = Some(arg.path, arg.fileName, arg.fileExtension)

  def unapplySeq(arg: RichFile): Option[Seq[String]] = Some(arg.splitedPath)
}
