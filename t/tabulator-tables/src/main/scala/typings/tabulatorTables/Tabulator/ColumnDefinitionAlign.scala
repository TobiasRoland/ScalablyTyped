package typings.tabulatorTables.Tabulator

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.tabulatorTables.tabulatorTablesStrings.left
  - typings.tabulatorTables.tabulatorTablesStrings.center
  - typings.tabulatorTables.tabulatorTablesStrings.right
*/
trait ColumnDefinitionAlign extends js.Object

object ColumnDefinitionAlign {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def center: typings.tabulatorTables.tabulatorTablesStrings.center = this.cast("center")
  @scala.inline
  def left: typings.tabulatorTables.tabulatorTablesStrings.left = this.cast("left")
  @scala.inline
  def right: typings.tabulatorTables.tabulatorTablesStrings.right = this.cast("right")
}

