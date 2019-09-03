package src.Part11.Operators

class Table {
  private val tableStartTag = "<table>"
  private val tableEndTag = "</table>"
  private val rowStartTag = "<tr>"
  private val rowEndTag = "</tr>"
  private val columnStartTag = "<td>"
  private val columnEndTag = "</td>"
  private val tableAndRowEnd = rowEndTag + tableEndTag

  private var content = tableStartTag + rowStartTag + rowEndTag + tableEndTag

  def this(content: String) {
    this()
    this.content = content
  }

  def |(newColumnData: String): Table = {
    val insertedDate = columnStartTag + newColumnData + columnEndTag
    val newContent = content.patch(content.length - tableAndRowEnd.length, insertedDate, 0)
    new Table(newContent)
  }

  def ||(newColumnData: String): Table = {
    val insertedDate = rowStartTag + columnStartTag + newColumnData + columnEndTag + rowEndTag
    val newContent = content.patch(content.length - tableEndTag.length, insertedDate, 0)
    new Table(newContent)
  }

  override def toString: String = content
}
